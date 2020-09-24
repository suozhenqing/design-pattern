package com.szq2.interface1.isolation;
/**
 * 接口隔离原则
 * @author suozhenqing
 * @date 2020-08-19
 */
public class InterfaceIsolation2 {
	
	public static void main(String[] args) {
		
		A_1 a_1 = new A_1();
		a_1.depend1(new B_1());
		a_1.depend2(new B_1());
		a_1.depend3(new B_1());
		
		C_1 c_1 = new C_1();
		c_1.depend1(new D_1());
		c_1.depend4(new D_1());
		c_1.depend5(new D_1());
	}
}

interface Interface1_1 {
	void operation1();
}
interface Interface2 {
	void operation2();
	void operation3();
}
interface Interface3 {
	void operation4();
	void operation5();
}
class B_1 implements Interface1_1, Interface2 {

	@Override
	public void operation1() {
		System.out.println("B实现了operation1。。。");
	}
	@Override
	public void operation2() {
		System.out.println("B实现了operation2。。。");
	}
	@Override
	public void operation3() {
		System.out.println("B实现了operation3。。。");
	}
}
class D_1 implements Interface1_1, Interface3 {

	@Override
	public void operation1() {
		System.out.println("D实现了operation1。。。");
	}
	@Override
	public void operation4() {
		System.out.println("D实现了operation4。。。");
	}
	@Override
	public void operation5() {
		System.out.println("D实现了operation5。。。");
	}
}
class A_1 {
	public void depend1(Interface1_1 i) {
		i.operation1();
	}
	public void depend2(Interface2 i) {
		i.operation2();
	}
	public void depend3(Interface2 i) {
		i.operation3();
	}
}
class C_1 {
	public void depend1(Interface1_1 i) {
		i.operation1();
	}
	public void depend4(Interface3 i) {
		i.operation4();
	}
	public void depend5(Interface3 i) {
		i.operation5();
	}
}