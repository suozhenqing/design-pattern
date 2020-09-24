package com.szq27.state;

public abstract class State {
	
	// 扣积分
	abstract void reduceMoney();
	// 是否抽中奖品
	abstract boolean raffle();
	// 发放奖品
	abstract void dispensePrize();
}
