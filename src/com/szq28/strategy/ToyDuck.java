package com.szq28.strategy;

public class ToyDuck extends Duck {

	public ToyDuck() {
		flyBehavior = new BadFlyBehavior();
	}
	
}
