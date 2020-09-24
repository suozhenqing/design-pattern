package com.szq17.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
	
	private Map<String, ConcreteWebSite> mapPool = new HashMap<>();
	
	public WebSite getWebSite(String type) {
		if (!mapPool.containsKey(type)) {
			mapPool.put(type, new ConcreteWebSite(type));
		}
		return mapPool.get(type);
	}
	
	public int getCount() {
		return mapPool.size();
	}
}
