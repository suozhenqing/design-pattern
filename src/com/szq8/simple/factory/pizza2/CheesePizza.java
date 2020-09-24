package com.szq8.simple.factory.pizza2;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给奶酪披萨准备原材料...");
	}

}