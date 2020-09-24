package com.szq9.abstract1.factory.order;

import com.szq9.abstract1.factory.pizza.LDCheesePizza;
import com.szq9.abstract1.factory.pizza.LDPepperPizza;
import com.szq9.abstract1.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用抽象工厂模式...");
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new LDCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
