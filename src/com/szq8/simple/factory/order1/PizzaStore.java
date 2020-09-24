package com.szq8.simple.factory.order1;
/**
 * 传统方式：
 *   优点：易于理解，简单易操纵
 *   缺点：违反ocp原则，对扩展开放(提供方)，对修改关闭(使用方)
 *        新增PepperPizza时：1-新增PepperPizza类，2-修改OrderPizza(多个)类,添加判断条件分支
 * @author suozhenqing
 * @date 2020-08-23
 */
public class PizzaStore {
	
	public static void main(String[] args) {
		
		new OrderPizza();
	}
}
