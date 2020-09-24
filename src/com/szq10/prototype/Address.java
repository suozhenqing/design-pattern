package com.szq10.prototype;

import java.io.Serializable;

public class Address implements Cloneable, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String provices;
	private String city;
	
	public Address(String provices, String city){
		this.provices = provices;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [provices=" + provices + ", city=" + city + "]";
	}
	
	/**
	 * 默认clone()方法，只对基本数据类型进行拷贝
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}