package com.szq9.abstract1.factory.order;
/**
 * 抽象工厂模式
 * @author suozhenqing
 * @date 2020-08-23
 */
public class PizzaStore {
	
	public static void main(String[] args) {
		
		new OrderPizza(new BJFactory());
	}
}
