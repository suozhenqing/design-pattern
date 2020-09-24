package com.szq26.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式：编译器、正则表达式、机器人...
 *   org.springframework.expression.spel.standard --> SpelExpressionParser
 * @author suozhenqing
 * @date 2020-09-02
 */
public class Client {
	
	public static void main(String[] args) throws IOException {
		
		String expStr = getExpStr();
		Map<String, Integer> var = getValue(expStr);
		Calculator calculator = new Calculator(expStr);
		System.out.println("运算结果 ----> " + expStr + "=" + calculator.run(var));
	}

	private static Map<String, Integer> getValue(String expStr) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				// 解决重复参数的问题
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + ch + "的值:");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		return map;
	}

	private static String getExpStr() throws IOException {
		System.out.println("请输入表达式。。。");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
}
