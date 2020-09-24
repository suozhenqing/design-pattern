package com.szq21.visitor;

public class Success extends Action {

	@Override
	void getManResult(Man man) {
		System.out.println("man的评价晋级。。。");
	}

	@Override
	void getWomanResult(Woman woman) {
		System.out.println("woman的评价晋级。。。");
	}

}
