package com.szq25.memento;
/**
 * 备忘录模式：恢复状态的机制，在不破坏封装性前提下，捕获对象的内部状态；数据库事务管理、游戏存档...
 *   缺点：类成员变量过多，占有比较大的资源，可以和原型模式(深、浅拷贝)搭配使用
 * @author suozhenqing
 * @date 2020-09-02
 */
public class Client {
	
	public static void main(String[] args) {
		
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("--------战斗前--------");
		gameRole.display();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());
		
		System.out.println("--------战斗后--------");
		gameRole.setVit(70);
		gameRole.setDef(70);
		gameRole.display();
		
		System.out.println("--------备忘录恢复--------");
		gameRole.recoverGameRole(caretaker.getMemento());
		gameRole.display();
	}
}
