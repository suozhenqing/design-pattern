package com.szq9.abstract1.factory.pizza;

public class BJPepperPizza extends Pizza {

	@Override
	public void prepare() {
		setName("北京胡椒披萨");
		System.out.println("给北京胡椒披萨准备原材料...");
	}

}