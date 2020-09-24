package com.szq18.proxy.cglib;
/**
 * Cglib代理：代理对象不需要实现接口，Spring中aop，实现方法拦截
 *   底层是通过使用字节码处理框架asm来转换字节码并生成新类
 * @author suozhenqing
 * @date 2020-08-28
 */
public class Client {
	
	public static void main(String[] args) {
		
		TeacherDao proxy = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
		// 可以有返回值
		proxy.teach();
	}
}
