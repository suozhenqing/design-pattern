package com.szq8.simple.factory.order1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.szq8.simple.factory.pizza1.CheesePizza;
import com.szq8.simple.factory.pizza1.GreekPizza;
import com.szq8.simple.factory.pizza1.Pepper;
import com.szq8.simple.factory.pizza1.Pizza;

public class OrderPizza {
	
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getOrderType();
			if ("greek".equals(orderType)) {
				pizza = new GreekPizza();
				pizza.setName("希腊披萨");
			} else if ("cheese".equals(orderType)) {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			}else if ("pepper".equals(orderType)) {
				pizza = new Pepper();
				pizza.setName("胡椒披萨");
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}
	private String getOrderType() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("输入订购披萨的种类：");
			return br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
