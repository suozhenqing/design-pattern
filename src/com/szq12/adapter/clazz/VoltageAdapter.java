package com.szq12.adapter.clazz;

public class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int output5V() {
		
		int src = output220V();
		// 适配
		int dst = src / 44;
		return dst;
	}
	
}
