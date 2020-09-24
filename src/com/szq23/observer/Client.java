package com.szq23.observer;

/**
 * 观察者模式：对象之间多对一依赖对设计方案
 *   java.util.Observable --> private Vector<Observer> obs;
 * @author suozhenqing
 * @date 2020-08-31
 */
public class Client {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		Sina sina = new Sina();
		weatherData.registerObserver(sina);
		
		Baidu baidu = new Baidu();
		weatherData.registerObserver(baidu);
		
		weatherData.setData(10F, 20F, 30F);
		System.out.println("------------------------------------");
		
		weatherData.removeObserver(baidu);
		weatherData.setData(40F, 50F, 60F);
	}
}
