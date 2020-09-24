package com.szq26.interpreter;

import java.util.Map;
import java.util.Stack;

public class Calculator {
	
	// 定义表达式
	private Expression expression;
	
	public Calculator(String expStr) {
		Stack<Expression> stack = new Stack<>();
		char[] charArray = expStr.toCharArray();
		
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		this.expression = stack.pop();
	}
	
	public int run(Map<String, Integer> map) {
		return this.expression.interpreter(map);
	}
}