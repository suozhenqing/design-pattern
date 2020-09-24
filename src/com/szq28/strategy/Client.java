package com.szq28.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 策略模式：分析变化与不变的部分，采用组合/聚合，少用继承
 *   缺点：策略过多时，类数目庞大
 * @author suozhenqing
 * @date 2020-09-08
 */
public class Client {
	
	public static void main(String[] args) {
		
		new WildDuck().fly();
		new ToyDuck().fly();
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		
		// 动态改变对象的行为
		pekingDuck.setFlyBehavior(new BadFlyBehavior());
		pekingDuck.fly();
		
		// jdk源码使用
		Integer[] array1 = {3, 2, 6, 4, 9, 7};
		// 升序排列
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Arrays.sort(array1, comparator);
		System.out.println(Arrays.toString(array1));
		
		// 降序排列
		Integer[] array2 = {3, 2, 6, 4, 9, 7};
		Arrays.sort(array2, (a, b) -> {
			if (a.compareTo(b) < 0) {
				return 1;
			} else {
				return -1;
			}
		});
		System.out.println(Arrays.toString(array2));
	}
}