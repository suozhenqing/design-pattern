package com.szq12.adapter.clazz;
/**
 * 类适配器：单继承；但是重写时，灵活性增加
 * @author suozhenqing
 * @date 2020-08-25
 */
public class Client {
	
	public static void main(String[] args) {
		
		new Phone().charging(new VoltageAdapter());
	}
}
