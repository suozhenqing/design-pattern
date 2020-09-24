package com.szq23.observer;

public class Sina implements Observer {
	// 温度
	private float temperature;
	// 气压
	private float pressure;
	// 湿度
	private float humidity;
	
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	private void display() {
		System.out.println("Sina 温度-->" + temperature + "，气压-->" + pressure + "，湿度-->" + humidity);
	}

}
