package com.szq23.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	// 温度
	private float temperature;
	// 气压
	private float pressure;
	// 湿度
	private float humidity;
	
	private List<Observer> list;
	
	public WeatherData() {
		list = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : list) {
			observer.update(temperature, pressure, humidity);
		}
	}
	
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

}
