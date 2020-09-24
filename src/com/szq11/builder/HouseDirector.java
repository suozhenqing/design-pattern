package com.szq11.builder;

public class HouseDirector {
	
	HouseBuilder houseBuilder = null;
	
	// 构造器传值
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	// setter方法传值
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	// 建造房子流程
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.build();
	}
}
