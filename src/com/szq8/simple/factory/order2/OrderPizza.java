package com.szq8.simple.factory.order2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.szq8.simple.factory.pizza2.Pizza;

public class OrderPizza {
	
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	public OrderPizza(SimpleFactory simpleFactory) {
		setSimpleFactory(simpleFactory);
	}

	public void setSimpleFactory(SimpleFactory simpleFactory) {
		String orderType = "";
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = getOrderType();
			pizza = this.simpleFactory.createPizza(orderType);
			if (null != pizza) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购披萨失败...");
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
