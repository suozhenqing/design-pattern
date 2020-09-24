package com.szq22.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
	
	Department[] departments;
	int number = 0;
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("java专业", "java专业");
		addDepartment("php专业", "php专业");
		addDepartment("大数据专业", "大数据专业");
	}

	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[number] = department;
		number++;
	}

	@Override
	public Iterator<Department> createIterator() {
		return new ComputerCollegeIterator(departments);
	}

}
