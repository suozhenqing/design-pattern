package com.szq8.simple.factory.order3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.szq8.simple.factory.pizza3.Pizza;

public abstract class OrderPizza {
	
	public abstract Pizza createPizza(String orderType);
	
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getOrderType();
			pizza = createPizza(orderType);
			if (null != pizza) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("披萨订购失败...");
				break;
			}
			
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
