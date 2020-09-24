package com.szq14.decorator;

public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		setDesc("牛奶");
		setPrice(2.0f);
	}

}
