package com.szq25.memento;

public class Caretaker {
	
	// 只保存一次状态
	private Memento memento;
	// 单个游戏角色保存多次
	//private List<Memento> mementoList;
	// 多个游戏角色保存多次
	//private Map<String, List<Memento>> mementoMap;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}