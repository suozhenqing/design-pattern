package com.szq9.abstract1.factory.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		setName("伦敦奶酪披萨");
		System.out.println("给伦敦奶酪披萨准备原材料...");
	}

}