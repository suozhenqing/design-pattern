package com.szq9.abstract1.factory.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.szq9.abstract1.factory.pizza.Pizza;

public class OrderPizza {
	
	AbsFactory factory;
	
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}
	
	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType;
		this.factory = factory;
		
		do {
			orderType = getOrderType();
			pizza = this.factory.createPizza(orderType);
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
