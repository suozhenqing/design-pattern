package com.szq1.single.responsibility;
/**
 * 单一职责原则
 * @author suozhenqing
 * @date 2020-08-19
 */
public class SingleResponsibility3 {
	
	public static void main(String[] args) {
		
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("汽车");
		vehicle2.runWater("轮船");
		vehicle2.runAir("飞机");
	}
}

class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行。。。");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + "在天空运行。。。");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + "在水里运行。。。");
	}
}