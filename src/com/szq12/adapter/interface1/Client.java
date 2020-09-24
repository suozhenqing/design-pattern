package com.szq12.adapter.interface1;
/**
 * 接口适配器：设计抽象类并实现接口，子类可选择性覆盖父类方法
 * @author suozhenqing
 * @date 2020-08-25
 */
public class Client {
	
	public static void main(String[] args) {
		
		AbstractClass abstractClass = new AbstractClass() {
			@Override
			public void operation1() {
				System.out.println("使用了operation1()。。。");
			}
		};
		abstractClass.operation1();
	}
}
