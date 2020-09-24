package com.szq21.visitor;

public class Wait extends Action {
	
	@Override
	void getManResult(Man man) {
		System.out.println("man的评价待定。。。");
	}

	@Override
	void getWomanResult(Woman woman) {
		System.out.println("woman的评价待定。。。");
	}
}
