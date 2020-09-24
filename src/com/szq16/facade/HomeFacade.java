package com.szq16.facade;

public class HomeFacade {
	
	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private AirConditioner airConditioner;
	
	public HomeFacade() {
		super();
		this.dvdPlayer = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.airConditioner = AirConditioner.getInstance();
	} 
	
	public void ready() {
		dvdPlayer.on();
		popcorn.on();
		airConditioner.on();
	}
	
	public void play() {
		dvdPlayer.play();
		popcorn.pop();
		airConditioner.up();
		airConditioner.down();
	}
	
	public void off() {
		dvdPlayer.off();
		popcorn.off();
		airConditioner.off();
	}
	
}
