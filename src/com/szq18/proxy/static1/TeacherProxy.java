package com.szq18.proxy.static1;

public class TeacherProxy implements TeacherInterface {
	
	private TeacherInterface target;
	
	public TeacherProxy(TeacherInterface target) {
		this.target = target;
	}
	
	@Override
	public void teach() {
		System.out.println("代理对象开始代理 ...");
		target.teach();
		System.out.println("代理对象结束代理 ...");
	}

}
