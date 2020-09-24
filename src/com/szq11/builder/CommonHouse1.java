package com.szq11.builder;

public class CommonHouse1 extends HouseBuilder {

	@Override
	void buildBasic() {
		System.out.println("给普通房子打地基...CommonHouse1");
	}

	@Override
	void buildWalls() {
		System.out.println("给普通房子砌墙...CommonHouse1");
	}

	@Override
	void roofed() {
		System.out.println("给普通房子封顶...CommonHouse1");
	}

}