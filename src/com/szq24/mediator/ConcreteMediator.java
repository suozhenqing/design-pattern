package com.szq24.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {
	
	private Map<String, Colleague> colleagueMap;
	private Map<String, String> interMap;
	
	public ConcreteMediator() {
		colleagueMap = new HashMap<>();
		interMap = new HashMap<>();
	}

	@Override
	void register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);
		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if(colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		}
	}
	// 核心处理逻辑
	@Override
	void getMessage(int stateChange, String colleagueName) {
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((Alarm) (colleagueMap.get(interMap.get("Alarm")))).startAlarm();
				((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
				((Alarm) (colleagueMap.get(interMap.get("Alarm")))).stopAlarm();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
			} else {
				
			}
		} else {
			// TV发出的消息在这里处理
		}
	}
}