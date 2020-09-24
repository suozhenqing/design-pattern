package com.szq16.facade;

public class AirConditioner {
	
	private static AirConditioner instance = new AirConditioner();
	
	private AirConditioner() {}
	
	public static AirConditioner getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("AirConditioner is on ...");
	}
	
	public void off() {
		System.out.println("AirConditioner is off ...");
	}
	
	public void up() {
		System.out.println("AirConditioner is up ...");
	}
	
	public void down() {
		System.out.println("AirConditioner is down ...");
	}
}
