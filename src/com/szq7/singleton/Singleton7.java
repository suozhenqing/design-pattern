package com.szq7.singleton;

public class Singleton7 {
	
	public static void main(String[] args) {
		
		Singleton_7 instance1 = Singleton_7.getSingleton();
		Singleton_7 instance2 = Singleton_7.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：Singleton_7加载时，静态内部类SingletonInstance不会加载
 *      当调用getSingleton，静态内部类才加载，jvm类装载时线程安全
 */
class Singleton_7 {
	
	private Singleton_7() {}
	
	private static class SingletonInstance {
		private static final Singleton_7 INSTANCE = new Singleton_7();
	}
	
	public static Singleton_7 getSingleton() {
		return SingletonInstance.INSTANCE;
	}
}