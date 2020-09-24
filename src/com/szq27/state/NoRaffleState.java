package com.szq27.state;

public class NoRaffleState extends State {
	
	RaffleActivity activity;
	
	public NoRaffleState(RaffleActivity activity) {
		this.activity = activity;
	}

	@Override
	void reduceMoney() {
		System.out.println("扣除50积分，您可以抽奖了。。。");
		activity.setState(activity.getCanRaffleState());
	}

	@Override
	boolean raffle() {
		System.out.println("扣除积分后才可以抽奖。。。");
		return false;
	}

	@Override
	void dispensePrize() {
		System.out.println("不能发放奖品。。。");
	}

}