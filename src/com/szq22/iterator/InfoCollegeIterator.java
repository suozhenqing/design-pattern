package com.szq22.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Department> {
	
	List<Department> departments;
	int index = -1;
	
	public InfoCollegeIterator(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public boolean hasNext() {
		if (index >= departments.size() - 1) {
			return false;
		} else {
			index++;
			return true;
		}
	}

	@Override
	public Department next() {
		return departments.get(index);
	}
	
	@Override
	public void remove() {
		// 空实现
	}

}
