package com.szq28.strategy;

public class NoFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("不能飞行。。。");
	}

}