package com.szq22.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
	
	List<Department> departments;
	int number = 0;
	
	public InfoCollege() {
		departments = new ArrayList<>();
		addDepartment("信息安全专业", "信息安全专业");
		addDepartment("网络安全专业", "网络安全专业");
		addDepartment("服务器安全", "服务器安全");
	}

	@Override
	public String getName() {
		return "信息工程学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments.add(department);
	}

	@Override
	public Iterator<Department> createIterator() {
		return new InfoCollegeIterator(departments);
	}

}
