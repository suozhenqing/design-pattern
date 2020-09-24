package com.szq8.simple.factory.order3;

import com.szq8.simple.factory.pizza3.LDCheesePizza;
import com.szq8.simple.factory.pizza3.LDPepperPizza;
import com.szq8.simple.factory.pizza3.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用工厂方法模式...");
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new LDCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
