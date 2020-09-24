package com.szq28.strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;

	public Duck() {}
	
	public void fly() {
		if (null != flyBehavior) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
