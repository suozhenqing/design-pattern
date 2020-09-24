package com.szq11.builder;

public abstract class HouseBuilder {
	
	protected House house = new House();
	
	// 打地基
	abstract void buildBasic();
	// 砌墙
	abstract void buildWalls();
	// 封顶
	abstract void roofed();
	
	public House build() {
		return house;
	}
}
