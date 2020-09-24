package com.szq26.interpreter;

import java.util.Map;

public abstract class Expression {
	
	// 解释公式和数值，key为表达式中都参数，value就是具体值 {a=10, b=20...}
	abstract int interpreter(Map<String, Integer> map);
}
