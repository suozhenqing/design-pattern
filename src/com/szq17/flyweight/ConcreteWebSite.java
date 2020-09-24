package com.szq17.flyweight;

public class ConcreteWebSite extends WebSite {
	
	// 共享部分，内部状态
	private String type = "";
	
	public ConcreteWebSite(String type) {
		this.type = type;
	}

	@Override
	void use(User user) {
		System.out.println("网站的发布形式为---->" + type +"，使用者---->" + user.getName());
	}

}
