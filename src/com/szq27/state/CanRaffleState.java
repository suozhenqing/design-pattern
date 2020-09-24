package com.szq27.state;

import java.util.Random;

public class CanRaffleState extends State {
	
	RaffleActivity activity;
	
	public CanRaffleState(RaffleActivity activity) {
		this.activity = activity;
	}

	@Override
	void reduceMoney() {
		System.out.println("已经扣过积分了。。。");
	}

	@Override
	boolean raffle() {
		System.out.println("正在抽奖，请稍等。。。");
		int number = new Random().nextInt(10);
		if (0 == number) {
			activity.setState(activity.getDispenseState());
			return true;
		} else {
			System.out.println("很遗憾，没有抽中奖品。。。");
			activity.setState(activity.getNoRaffleState());
			return false;
		}
	}

	@Override
	void dispensePrize() {
		System.out.println("没有中奖，不能发放奖品。。。");
	}

}