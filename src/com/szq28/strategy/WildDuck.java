package com.szq28.strategy;

public class WildDuck extends Duck {

	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}
	
}
