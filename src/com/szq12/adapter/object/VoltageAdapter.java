package com.szq12.adapter.object;

public class VoltageAdapter implements Voltage5V {
	
	private Voltage220V voltage220v;
	
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220v = voltage220V;
	}
	
	@Override
	public int output5V() {
		
		int dst = 0;
		if (null != voltage220v) {
			int src = voltage220v.output220V();
			System.out.println("使用对象适配器。。。");
			// 适配
			dst = src / 44;
			System.out.println("适配完成。。。");
		}
		return dst;
	}
	
}
