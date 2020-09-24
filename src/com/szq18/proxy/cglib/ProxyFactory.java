package com.szq18.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	
	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		// 1. 创建工具类
		Enhancer enhancer = new Enhancer();
		// 2. 设置父类
		enhancer.setSuperclass(target.getClass());
		// 3. 设置回调函数
		enhancer.setCallback(this);
		// 4. 创建子类对象
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("cglib 动态代理开始 ...");
		Object object = method.invoke(target, args);
		System.out.println("cglib 动态代理结束 ...");
		return object;
	}
	
}
