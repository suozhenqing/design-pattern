package com.szq11.builder;

public class HighHouse extends HouseBuilder {
	
	@Override
	void buildBasic() {
		System.out.println("给高楼打地基...HighHouse");
	}

	@Override
	void buildWalls() {
		System.out.println("给高楼砌墙...HighHouse");
	}

	@Override
	void roofed() {
		System.out.println("给高楼封顶...HighHouse");
	}
}
