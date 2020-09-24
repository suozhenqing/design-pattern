package com.szq7.singleton;
/**
 * 单例模式：某个类只存在一个对象实例
 *   1. 饿汉式(线程安全，静态常量，可以使用)
 *   2. 饿汉式(线程安全，静态代码块，可以使用)
 *   3. 懒汉式(线程不安全，不推荐使用)
 *   4. 懒汉式(线程安全，同步方法，不推荐使用)
 *   5. 懒汉式(线程不安全，同步代码块，不推荐使用)
 *   6. 双重检查(线程安全，推荐使用)
 *   7. 静态内部类(线程安全，推荐使用)
 *   8. 枚举(线程安全，推荐使用)
 * @author suozhenqing
 * @date 2020-08-22
 */
public class Singleton1 {
	
	public static void main(String[] args) {
		
		Singleton_1 instance1 = Singleton_1.getSingleton();
		Singleton_1 instance2 = Singleton_1.getSingleton();
		System.out.println(instance1 == instance2);
	}
}
/**
 * 优点：类装载时完成实例化，避免线程安全问题
 * 缺点：没有懒加载，可能造成内存浪费
 */
class Singleton_1 {
	
	private final static Singleton_1 instance = new Singleton_1();
	
	private Singleton_1() {}
	
	public static Singleton_1 getSingleton() {
		return instance;
	}
}