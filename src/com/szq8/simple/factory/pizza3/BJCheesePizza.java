package com.szq8.simple.factory.pizza3;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		setName("北京奶酪披萨");
		System.out.println("给北京奶酪披萨准备原材料...");
	}

}