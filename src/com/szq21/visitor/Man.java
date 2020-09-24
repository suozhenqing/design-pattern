package com.szq21.visitor;
/**
 * 双分派：在客户端，将具体状态作为参数传递给Man
 *   然后Man类调用作为参数的“具体方法”中，同时将自己(this)作为参数传入
 */
public class Man extends Person {

	@Override
	void accept(Action action) {
		
		action.getManResult(this);
		
	}

}
