package com.szq26.interpreter;

import java.util.Map;

public class SymbolExpression extends Expression {
	
	protected Expression left;
	protected Expression right;
	
	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	/**
	 * 让子类实现
	 */
	@Override
	int interpreter(Map<String, Integer> map) {
		return 0;
	}

}