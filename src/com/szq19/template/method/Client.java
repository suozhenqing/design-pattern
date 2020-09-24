package com.szq19.template.method;
/**
 * 模版方法：钩子方法
 *   spring ioc容器初始化 refresh()方法
 * @author suozhenqing
 * @date 2020-08-30
 */
public class Client {
	
	public static void main(String[] args) {
		
		SoyaMilk soyaMilk1 = new RedBeanSoyaMilk();
		soyaMilk1.make();
		System.out.println("--------------------");
		
		SoyaMilk soyaMilk2 = new BlackBeanSoyaMilk();
		soyaMilk2.make();
		System.out.println("--------------------");
		
		// 纯豆浆，重写钩子方法
		SoyaMilk soyaMilk3 = new PureSoyaMilk();
		soyaMilk3.make();
	}
}
