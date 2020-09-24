package com.szq18.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherProxy {
	
	private Object target;
	
	public TeacherProxy(Object target) {
		this.target = target;
	}
	/*
	 * ClassLoader loader：当前对象的类加载器
       Class<?>[] interfaces：目标对象实现的接口类型
       InvocationHandler h：事件处理
	 */
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("jdk 动态代理开始 ...");
						Object object = method.invoke(target, args);
						System.out.println("jdk 动态代理结束 ...");
						return object;
					}
				});
	}

}
