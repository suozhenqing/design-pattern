package com.szq27.state;
/**
 * 状态模式：对象状态转换时，对外输出不同的行为，可替换if...else...，符合开闭原则
 *   缺点：类可能过多，加大维护难度
 * @author suozhenqing
 * @date 2020-09-07
 */
public class Client {
	
	public static void main(String[] args) {
		
		RaffleActivity raffleActivity = new RaffleActivity(1);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("---------第" + (i + 1) + "次抽奖---------");
			// 扣积分
			raffleActivity.reduceMoney();
			// 抽奖
			raffleActivity.raffle();
		}
	}
}
