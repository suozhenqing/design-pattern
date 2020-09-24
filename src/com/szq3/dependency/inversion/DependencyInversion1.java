package com.szq3.dependency.inversion;
/**
 * 依赖倒置原则：
 *   1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象
     2. 抽象不应该依赖细节，细节应该依赖抽象
     3. 依赖倒置的中心思想是面向接口编程
   依赖关系传递方式：
     1. 接口传递
     2. 构造方法传递
     3. setter方法传递
 * @author suozhenqing
 * @date 2020-08-19
 */
public class DependencyInversion1 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.receive(new Email());
	}
}

class Email {
	
	public String getInfo() {
		return "电子邮件信息：hello world";
	}
}
/**
 * 问题：如果获取对象是微信、短信。。。
 *   需要新增类，同时Person需要新增相应的接收方法
 */
class Person {
	
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}