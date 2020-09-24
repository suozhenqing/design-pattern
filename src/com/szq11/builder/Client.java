package com.szq11.builder;
/**
 * 传统方式
 *   优点：简单易操作
 *   缺点：把产品(房子)和创建产品的过程(建房子流程)封装在一起，耦合性增强，不利于程序扩展和维护
 * @author suozhenqing
 * @date 2020-08-23
 */
public class Client {
	
	public static void main(String[] args) {
		
		CommonHouse commonHouse = new CommonHouse();
		commonHouse.build();
	}
}
