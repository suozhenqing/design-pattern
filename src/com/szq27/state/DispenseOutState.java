package com.szq27.state;

public class DispenseOutState extends State {
	
	RaffleActivity activity;
	
	public DispenseOutState(RaffleActivity activity) {
		this.activity = activity;
	}

	@Override
	void reduceMoney() {
		System.out.println("奖品发送完了，请下次再参与。。。");
	}

	@Override
	boolean raffle() {
		System.out.println("奖品发送完了，请下次再参与。。。");
		return false;
	}

	@Override
	void dispensePrize() {
		System.out.println("奖品发送完了，请下次再参与。。。");
	}

}