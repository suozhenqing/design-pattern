package com.szq9.abstract1.factory.order;

import com.szq9.abstract1.factory.pizza.BJCheesePizza;
import com.szq9.abstract1.factory.pizza.BJPepperPizza;
import com.szq9.abstract1.factory.pizza.Pizza;

public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用抽象工厂模式...");
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new BJCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
