package com.szq7.singleton;

public class Singleton6 {
	
	public static void main(String[] args) {
		
		Singleton_6 instance1 = Singleton_6.getSingleton();
		Singleton_6 instance2 = Singleton_6.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：使用时才加载，多线程下安全
 */
class Singleton_6 {
	
	private static volatile Singleton_6 instance;
	
	private Singleton_6() {}
	
	public static Singleton_6 getSingleton() {
		if (null == instance) {
			synchronized (Singleton_6.class) {
				if (null == instance) {
					instance = new Singleton_6();
				}
			}
		}
		return instance;
	}
}