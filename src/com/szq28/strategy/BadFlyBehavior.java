package com.szq28.strategy;

public class BadFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("飞行能力一般。。。");
	}

}