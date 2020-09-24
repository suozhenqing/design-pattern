package com.szq18.proxy.dynamic;
/**
 * 动态代理：JDK代理/接口代理
 * @author suozhenqing
 * @date 2020-08-28
 */
public class Client {
	
	public static void main(String[] args) {
		
		TeacherProxy proxy = new TeacherProxy(new TeacherDao());
		TeacherInterface teacherInterface = (TeacherInterface) proxy.getProxyInstance();
		
		System.out.println(teacherInterface);
		// class com.sun.proxy.$Proxy0 内存中的代理对象
		System.out.println(teacherInterface.getClass());
		
		teacherInterface.teach();
	}

}
