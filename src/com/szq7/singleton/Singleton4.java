package com.szq7.singleton;

public class Singleton4 {
	
	public static void main(String[] args) {
		
		Singleton_4 instance1 = Singleton_4.getSingleton();
		Singleton_4 instance2 = Singleton_4.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：使用时才加载,多线程下安全
 * 缺点：效率太低
 */
class Singleton_4 {
	
	private static Singleton_4 instance;
	
	private Singleton_4() {}
	
	public static synchronized Singleton_4 getSingleton() {
		if (null == instance) {
			instance = new Singleton_4();
		}
		return instance;
	}
}