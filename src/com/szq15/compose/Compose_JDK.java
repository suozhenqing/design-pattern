package com.szq15.compose;

import java.util.HashMap;
import java.util.Map;

public class Compose_JDK {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		// 存放叶子节点，Node<K,V> next
		map1.put(1, "西游记");
		map1.put(2, "水浒传");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(3, "红楼梦");
		map2.put(4, "三国演义");
		
		map1.putAll(map2);
		System.out.println(map1.toString());
		System.out.println("----------------------------");
		
		System.out.println(map2.toString());
	}
}
