package com.szq6.demeter.principle;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 * @author suozhenqing
 * @date 2020-08-19
 */
public class Demeter2 {
	
	public static void main(String[] args) {
		
		SchoolManager1 schoolManager = new SchoolManager1();
		schoolManager.printAllEmployee(new CollegeManager1());
	}
}

class Employee1 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
class CollegeEmployee1 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
class CollegeManager1 {
	public List<CollegeEmployee1> getAllEmployee() {
		List<CollegeEmployee1> list = new ArrayList<CollegeEmployee1>();
		for (int i = 1; i <= 10; i++) {
			CollegeEmployee1 collegeEmployee = new CollegeEmployee1();
			collegeEmployee.setId("学院员工id=" + i);
			list.add(collegeEmployee);
		}
		return list;
	}
	public void printEmployee() {
		List<CollegeEmployee1> list1 = this.getAllEmployee();
		System.out.println("----------学院员工----------");
		for (CollegeEmployee1 collegeEmployee : list1) {
			System.out.println(collegeEmployee.getId());
		}
	}
}
/**
 * 直接朋友：List<Employee>(返回值)、CollegeManager collegeManager(方法参数)、成员变量
 * 非直接朋友：List<CollegeEmployee>(局部变量)
 */
class SchoolManager1 {
	public List<Employee1> getAllEmployee() {
		List<Employee1> list = new ArrayList<Employee1>();
		for (int i = 1; i <= 5; i++) {
			Employee1 employee = new Employee1();
			employee.setId("学校总部员工id=" + i);
			list.add(employee);
		}
		return list;
	}
	public void printAllEmployee(CollegeManager1 collegeManager) {
		
		collegeManager.printEmployee();
		
		List<Employee1> list2 = this.getAllEmployee();
		System.out.println("----------学校总部员工----------");
		for (Employee1 employee : list2) {
			System.out.println(employee.getId());
		}
	}
}