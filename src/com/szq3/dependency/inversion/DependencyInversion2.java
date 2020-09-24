package com.szq3.dependency.inversion;
/**
 * 依赖倒置原则
 * @author suozhenqing
 * @date 2020-08-19
 */
public class DependencyInversion2 {
	
	public static void main(String[] args) {
		
		Person1 person1 = new Person1();
		person1.receive(new Email1());
		
		person1.receive(new Weixin());
	}
}

interface IReceive {
	String getInfo();
}
class Email1 implements IReceive {
	
	public String getInfo() {
		return "电子邮件信息：hello world";
	}
}
class  Weixin implements IReceive {
	
	public String getInfo() {
		return "微信信息：hello world";
	}
}
/**
 * 问题：如果获取对象是微信、短信。。。
 *   需要新增类，同时Person需要新增相应的接收方法
 */
class Person1 {
	
	public void receive(IReceive receive) {
		System.out.println(receive.getInfo());
	}
}