package com.szq24.mediator;

public class TV extends Colleague {
	
	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}
	
	public void sendTV(int stateChange) {
		sendMessage(stateChange);
	}
	
	@Override
	void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}
	
	public void startTV() {
		System.out.println("打开电视机。。。");
	}
	
	public void stopTV() {
		System.out.println("关闭电视机。。。");
	}
	
}
