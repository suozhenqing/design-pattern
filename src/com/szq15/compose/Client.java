package com.szq15.compose;
/**
 * 组合模式：也叫部分整体模式，用在类似树形结构(叶子节点、非叶子节点(有管理功能))的地方
 * @author suozhenqing
 * @date 2020-08-27
 */
public class Client {
	
	public static void main(String[] args) {
		
		OrganizationComponent university = new University("清华大学", "清华大学");
		
		
		OrganizationComponent college1 = new College("计算机学院", "计算机学院");
		OrganizationComponent college2 = new College("信息工程学院", "信息工程学院");
		
		college1.add(new Department("软件工程", "软件工程"));
		college1.add(new Department("网络工程", "网络工程"));
		college1.add(new Department("计算机科学与技术", "计算机科学与技术"));
		
		college2.add(new Department("通信工程", "通信工程"));
		college2.add(new Department("信息工程", "信息工程"));
		
		university.add(college1);
		university.add(college2);
		
		university.print();
		System.out.println("-----------------");
		
		college2.print();
	}
}
