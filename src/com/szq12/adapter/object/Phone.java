package com.szq12.adapter.object;

public class Phone {
	
	public void charging(Voltage5V voltage5v) {
		if (voltage5v.output5V() == 5) {
			System.out.println("电压为5V，可以充电。。。");
		} else {
			System.out.println("电压大于5V，禁止充电。。。");
		}
	}
}
