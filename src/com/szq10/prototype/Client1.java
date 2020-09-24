package com.szq10.prototype;
/**
 * 传统方式
 *   优点：易于理解，操作简单
 *   缺点：每次都要创建对象，效率低，可考虑克隆替代
 * @author suozhenqing
 * @date 2020-08-23
 */
public class Client1 {
	
	public static void main(String[] args) {
		
		Sheep1 sheep1 = new Sheep1("tom", 1, "白色");
		Sheep1 sheep2 = new Sheep1(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
		Sheep1 sheep3 = new Sheep1(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
		Sheep1 sheep4 = new Sheep1(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
		Sheep1 sheep5 = new Sheep1(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
		
		System.out.println(sheep1);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
	}
}
