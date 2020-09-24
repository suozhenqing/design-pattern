package com.szq23.observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
