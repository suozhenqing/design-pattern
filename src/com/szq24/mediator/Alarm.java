package com.szq24.mediator;

public class Alarm extends Colleague {
	
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}
	
	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}
	
	@Override
	void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}
	
	public void startAlarm() {
		System.out.println("打开闹铃。。。");
	}
	
	public void stopAlarm() {
		System.out.println("关闭闹铃。。。");
	}
}