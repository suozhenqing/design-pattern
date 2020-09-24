package com.szq15.compose;
/**
 * 叶子节点，无管理功能，不需要重写add、remove方法
 */
public class Department extends OrganizationComponent {

	public Department(String name, String desc) {
		super(name, desc);
	}
	
	@Override
	protected void print() {
		System.out.println(getName());
	}

}
