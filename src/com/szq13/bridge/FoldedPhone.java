package com.szq13.bridge;

public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		System.out.println("折叠式手机");
		super.open();
	}
	
	public void close() {
		System.out.println("折叠式手机");
		super.close();
	}
	
	public void call() {
		System.out.println("折叠式手机");
		super.call();
	}
}
