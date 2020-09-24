package com.szq8.simple.factory.order2;
/**
 * 工厂模式：简单工厂模式/静态工厂模式
 *   优点：由工厂对象决定创建具体实例，并封装了实例化对象的行为
 *        新增ChinaPizza时：1-新增ChinaPizza类，2-修改SimpleFactory，添加判断条件分支，不需要修改OrderPizza(多个)类
 * @author suozhenqing
 * @date 2020-08-23
 */
public class PizzaStore {
	
	public static void main(String[] args) {
		
		new OrderPizza(new SimpleFactory());
	}
}
