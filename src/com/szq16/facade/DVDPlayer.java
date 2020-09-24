package com.szq16.facade;

public class DVDPlayer {
	
	private static DVDPlayer instance = new DVDPlayer();
	
	private DVDPlayer() {}
	
	public static DVDPlayer getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("DVDPlayer is on ...");
	}
	
	public void off() {
		System.out.println("DVDPlayer is off ...");
	}
	
	public void play() {
		System.out.println("DVDPlayer is playing ...");
	}
}
