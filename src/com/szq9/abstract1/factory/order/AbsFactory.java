package com.szq9.abstract1.factory.order;

import com.szq9.abstract1.factory.pizza.Pizza;

public interface AbsFactory {
	
	public Pizza createPizza(String orderType);
}
