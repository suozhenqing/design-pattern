package com.szq18.proxy.static1;

public class TeacherDao implements TeacherInterface {
	
	@Override
	public void teach() {
		System.out.println("TeacherDao teach ...");
	}

}
