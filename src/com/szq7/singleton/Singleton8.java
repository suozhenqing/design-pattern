package com.szq7.singleton;

public class Singleton8 {
	
	public static void main(String[] args) {
		
		Singleton_8 instance1 = Singleton_8.INSTANCE;
		Singleton_8 instance2 = Singleton_8.INSTANCE;
		System.out.println(instance1 == instance2);
		
		instance1.getSingleton();
	}
	
}
/**
 * 优点：线程安全，且防止反序列化重新创建新的对象
 */
enum Singleton_8 {
	
	INSTANCE;
	
	public void getSingleton() {
		System.out.println("getSingleton...");
	}
}