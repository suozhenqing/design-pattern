package com.szq11.builder;
/**
 * 建造者模式：产品角色、抽象建造者(接口/抽象类)、具体建造者、指挥者；如果产品之间差异性很大，则不适用
 * @author suozhenqing
 * @date 2020-08-23
 */
public class Client1 {
	
	public static void main(String[] args) {
		
		// 普通房子
		CommonHouse1 commonHouse = new CommonHouse1();
		// 创建房子指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		// 完成盖房子，返回产品(房子)
		houseDirector.constructHouse();
		System.out.println("------------------------------");
		
		// 普通房子
		HighHouse highHouse = new HighHouse();
		// 创建房子指挥者
		houseDirector.setHouseBuilder(highHouse);
		// 完成盖房子，返回产品(房子)
		houseDirector.constructHouse();
	}
}
