package com.szq15.compose;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
	
	// list中实质为Department
	List<OrganizationComponent> lists = new ArrayList<OrganizationComponent>();
	
	public College(String name, String desc) {
		super(name, desc);
	}
	
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		lists.add(organizationComponent);
	}
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		lists.remove(organizationComponent);
	}
	
	@Override
	protected void print() {
		System.out.println("------" + super.getName() + "------");
		for (OrganizationComponent list : lists) {
			list.print();
		}
	}

}
