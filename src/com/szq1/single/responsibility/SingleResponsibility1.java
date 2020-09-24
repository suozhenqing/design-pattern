package com.szq1.single.responsibility;
/**
 * 单一职责原则：降低类的复杂度，一个类只负责一个职责
 * @author suozhenqing
 * @date 2020-08-19
 */
public class SingleResponsibility1 {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}
}

class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行。。。");
	}
}