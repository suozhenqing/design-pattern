package com.szq8.simple.factory.order2;

import com.szq8.simple.factory.pizza2.CheesePizza;
import com.szq8.simple.factory.pizza2.GreekPizza;
import com.szq8.simple.factory.pizza2.Pepper;
import com.szq8.simple.factory.pizza2.Pizza;

public class SimpleFactory {
	
	/**
	 * 静态工厂模式下，可以直接SimpleFactory.createPizza(String orderType)调用
	 * 不需要在OrderPizza中定义SimpleFactory，但多个工厂时不建议使用，可考虑抽象工厂模式
	 */
	public Pizza createPizza(String orderType) {
		System.out.println("使用简单工厂模式...");
		
		Pizza pizza = null;
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨");
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨");
		}else if ("pepper".equals(orderType)) {
			pizza = new Pepper();
			pizza.setName(" 胡椒披萨");
		}
		return pizza;
	}
}
