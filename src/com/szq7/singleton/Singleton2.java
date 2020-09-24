package com.szq7.singleton;

public class Singleton2 {
	
	public static void main(String[] args) {
		
		Singleton_2 instance1 = Singleton_2.getSingleton();
		Singleton_2 instance2 = Singleton_2.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：类装载时完成实例化，避免线程安全问题
 * 缺点：没有懒加载，可能造成内存浪费
 */
class Singleton_2 {
	
	private static Singleton_2 instance;
	
	static {
		instance = new Singleton_2();
	}
	
	private Singleton_2() {}
	
	public static Singleton_2 getSingleton() {
		return instance;
	}
}