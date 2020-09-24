package com.szq18.proxy.static1;
/**
 * 静态代理：代理对象与目标对象要实现相同的接口
 *   优点：通过代理对象对目标功能进行扩展
 *   缺点：代理对象和被代理对象要实现一样的接口，代理类较多；新增接口方法时，均需要实现
 * @author suozhenqing
 * @date 2020-08-28
 */
public class Client {
	
	public static void main(String[] args) {
		
		TeacherProxy proxy = new TeacherProxy(new TeacherDao());
		proxy.teach();
	}
}
