package com.szq7.singleton;

public class Singleton3 {
	
	public static void main(String[] args) {
		
		Singleton_3 instance1 = Singleton_3.getSingleton();
		Singleton_3 instance2 = Singleton_3.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：使用时才加载
 * 缺点：多线程下不安全
 */
class Singleton_3 {
	
	private static Singleton_3 instance;
	
	private Singleton_3() {}
	
	public static Singleton_3 getSingleton() {
		if (null == instance) {
			instance = new Singleton_3();
		}
		return instance;
	}
}