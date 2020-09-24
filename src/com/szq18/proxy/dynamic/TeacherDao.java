package com.szq18.proxy.dynamic;

public class TeacherDao implements TeacherInterface {
	
	@Override
	public void teach() {
		System.out.println("TeacherDao teach ...");
	}

}
