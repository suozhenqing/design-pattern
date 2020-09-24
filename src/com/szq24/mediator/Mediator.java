package com.szq24.mediator;

public abstract class Mediator {
	
	abstract void register(String colleagueName, Colleague colleague);
	
	abstract void getMessage(int stateChange, String colleagueName);
	
}
