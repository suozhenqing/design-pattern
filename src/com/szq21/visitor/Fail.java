package com.szq21.visitor;

public class Fail extends Action {

	@Override
	void getManResult(Man man) {
		System.out.println("man的评价淘汰。。。");
	}

	@Override
	void getWomanResult(Woman woman) {
		System.out.println("woman的评价淘汰。。。");
	}

}
