package com.szq26.interpreter;

import java.util.Map;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	int interpreter(Map<String, Integer> map) {
		return super.left.interpreter(map) - super.right.interpreter(map);
	}

}
