package com.szq24.mediator;
/**
 * 中介者模式：用中介者对象封装一系列对象对交互，将Alarm、TV...解耦
 * @author suozhenqing
 * @date 2020-09-01
 */
public class Client {
	
	public static void main(String[] args) {
		
		Mediator mediator = new ConcreteMediator();
		Alarm alarm = new Alarm(mediator, "Alarm");
		TV tv = new TV(mediator, "TV");
		
		alarm.sendAlarm(0);
		tv.sendTV(1);
		alarm.sendAlarm(1);
	}
}
