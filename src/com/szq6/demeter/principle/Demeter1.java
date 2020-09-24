package com.szq6.demeter.principle;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则：最少知道原则，即对被依赖的类不管多复杂，都尽量将逻辑封装在类的内部，并对外提供public方法，降低类之间的耦合
 * @author suozhenqing
 * @date 2020-08-19
 */
public class Demeter1 {
	
	public static void main(String[] args) {
		
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());
	}
}

class Employee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 1; i <= 10; i++) {
			CollegeEmployee collegeEmployee = new CollegeEmployee();
			collegeEmployee.setId("学院员工id=" + i);
			list.add(collegeEmployee);
		}
		return list;
	}
}
/**
 * 直接朋友：成员变量、List<Employee>(方法返回值)、CollegeManager collegeManager(方法参数)
 * 非直接朋友：List<CollegeEmployee>(局部变量)
 */
class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 1; i <= 5; i++) {
			Employee employee = new Employee();
			employee.setId("学校总部员工id=" + i);
			list.add(employee);
		}
		return list;
	}
	public void printAllEmployee(CollegeManager collegeManager) {
		List<CollegeEmployee> list1 = collegeManager.getAllEmployee();
		System.out.println("----------学院员工----------");
		for (CollegeEmployee collegeEmployee : list1) {
			System.out.println(collegeEmployee.getId());
		}
		
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("----------学校总部员工----------");
		for (Employee employee : list2) {
			System.out.println(employee.getId());
		}
	}
}