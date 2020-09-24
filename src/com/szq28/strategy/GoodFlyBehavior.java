package com.szq28.strategy;

public class GoodFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("飞行能力很好。。。");
	}

}