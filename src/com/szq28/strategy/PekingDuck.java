package com.szq28.strategy;

public class PekingDuck extends Duck {

	public PekingDuck() {
		flyBehavior = new NoFlyBehavior();
	}
	
}
