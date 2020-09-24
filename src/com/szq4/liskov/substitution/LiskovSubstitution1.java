package com.szq4.liskov.substitution;
/**
 * 里氏替换原则：所有引用基类的地方，必须能透明的使用其子类的对象
 *   在子类中尽量不要重写父类的方法，可通过聚合、组合、依赖来解决
 * @author suozhenqing
 * @date 2020-08-19
 */
public class LiskovSubstitution1 {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));
		System.out.println("-----------------");
		
		B b = new B();
		// 重写可能计算错误，重写将使用子类方法
		System.out.println("11-3=" + b.func1(11, 3));
		System.out.println("1-8=" + b.func1(1, 8));
		System.out.println("11-3+9=" + b.func2(11, 3));
	}
}

class A {
	
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}
class B extends A {
	
	public int func1(int a, int b) {
		return a + b;
	}
	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
}