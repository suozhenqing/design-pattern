package com.szq27.state;

public class DispenseState extends State {
	
	RaffleActivity activity;
	
	public DispenseState(RaffleActivity activity) {
		this.activity = activity;
	}

	@Override
	void reduceMoney() {
		System.out.println("不能扣积分。。。");
	}

	@Override
	boolean raffle() {
		System.out.println("不能抽奖。。。");
		return false;
	}

	@Override
	void dispensePrize() {
		if (activity.getCount() > 0) {
			System.out.println("恭喜您中奖了。。。");
			activity.setState(activity.getNoRaffleState());
		} else {
			System.out.println("很遗憾，奖品发送完了。。。");
			activity.setState(activity.getDispenseOutState());
			//System.out.println("抽奖活动结束。。。");
			//System.exit(0);
		}
	}
}