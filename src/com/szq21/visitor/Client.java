package com.szq21.visitor;
/**
 * 访问者模式：将数据结构和数据操作分离，适用于数据结构稳定的系统，功能经常变化
 *   缺点：违法类迪米特法则；访问者依赖的是具体元素，并非抽象元素
 * @author suozhenqing
 * @date 2020-08-31
 */
public class Client {
	
	public static void main(String[] args) {
		
		ObjectStructure object1 = new ObjectStructure();
		object1.attach(new Man());
		object1.attach(new Woman());
		
		Success success = new Success();
		object1.display(success);
		System.out.println("---------------------");
		
		Fail fail = new Fail();
		object1.display(fail);
		System.out.println("---------------------");
		
		Wait wait = new Wait();
		object1.display(wait);
	}
}
