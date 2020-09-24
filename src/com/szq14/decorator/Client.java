package com.szq14.decorator;
/**
 * 装饰者模式：动态的将新功能附加到对象上，java io流中使用到
 *   Inputstream：抽象基类，类似Drink，被装饰者
 *     FileInputstream...：类似LongBlack
 *   FilterInputstream：类似Decorator...装饰者
 *     BufferInputstream...：类似Milk...
 * @author suozhenqing
 * @date 2020-08-27
 */
public class Client {
	
	public static void main(String[] args) {
		
		// 2份巧克力 + 1份牛奶 + LongBlack
		Drink drink1 = new Chocolate(new Chocolate(new Milk(new LongBlack())));
		System.out.println(drink1.getDesc());
		System.out.println(drink1.cost());
		
		// 1份豆浆 + 1份巧克力 + 1份牛奶 + LongBlack
		Drink drink2 = new Soy(new Chocolate(new Milk(new LongBlack())));
		System.out.println(drink2.getDesc());
		System.out.println(drink2.cost());
	}
}
