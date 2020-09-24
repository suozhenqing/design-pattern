package com.szq22.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式：集合元素是不同方式实现，如数组、集合...解决了统一遍历问题
 *   缺点：每个聚合对象，都需要一个迭代器，不易管理
 * @author suozhenqing
 * @date 2020-08-31
 */
public class Client {
	
	public static void main(String[] args) {
		
		List<College> colleges = new ArrayList<>();
		colleges.add(new ComputerCollege());
		//colleges.add(new InfoCollege());
		
		OutPut outPut = new OutPut(colleges);
		outPut.printCollege();
	}
}