package com.szq8.simple.factory.order3;

import com.szq8.simple.factory.pizza3.BJCheesePizza;
import com.szq8.simple.factory.pizza3.BJPepperPizza;
import com.szq8.simple.factory.pizza3.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用工厂方法模式...");
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new BJCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
