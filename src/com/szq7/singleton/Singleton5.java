package com.szq7.singleton;

public class Singleton5 {
	
	public static void main(String[] args) {
		
		Singleton_5 instance1 = Singleton_5.getSingleton();
		Singleton_5 instance2 = Singleton_5.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：使用时才加载
 * 缺点：多线程下不安全
 */
class Singleton_5 {
	
	private static Singleton_5 instance;
	
	private Singleton_5() {}
	
	public static Singleton_5 getSingleton() {
		if (null == instance) {
			synchronized (Singleton_5.class) {
				instance = new Singleton_5();
			}
		}
		return instance;
	}
}