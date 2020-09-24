package com.szq23.observer;

public interface Observer {
	
	// 温度、气压、湿度
	void update(float temperature, float pressure, float humidity);
}
