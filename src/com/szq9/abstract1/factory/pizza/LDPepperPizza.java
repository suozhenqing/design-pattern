package com.szq9.abstract1.factory.pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		setName("伦敦胡椒披萨");
		System.out.println("给伦敦胡椒披萨准备原材料...");
	}

}