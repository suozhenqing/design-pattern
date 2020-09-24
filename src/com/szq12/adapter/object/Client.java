package com.szq12.adapter.object;
/**
 * 对象适配器：使用组合替代继承
 * @author suozhenqing
 * @date 2020-08-25
 */
public class Client {
	
	public static void main(String[] args) {
		
		new Phone().charging(new VoltageAdapter(new Voltage220V()));
	}
}
