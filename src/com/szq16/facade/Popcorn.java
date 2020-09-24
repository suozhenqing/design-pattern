package com.szq16.facade;

public class Popcorn {
	
	private static Popcorn instance = new Popcorn();
	
	private Popcorn() {}
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("Popcorn is on ...");
	}
	
	public void off() {
		System.out.println("Popcorn is off ...");
	}
	
	public void pop() {
		System.out.println("Popcorn is poping ...");
	}
}
