package com.szq22.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPut {
	
	List<College> collegeList;
	
	public OutPut(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	public void printDepartment(Iterator<Department> iterator) {
		while (iterator.hasNext()) {
			Department department = iterator.next();
			System.out.println(department.getName());
		}
	}
	
	public void printCollege() {
		Iterator<College> iterator = collegeList.iterator();
		while (iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("-----" + college.getName() + "-----");
			printDepartment(college.createIterator());
		}
	}
}
