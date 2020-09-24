package com.szq20.command;
/**
 * 空执行，用于初始化所有按钮；当调用时，对象什么都不操作
 */
public class NoCommand implements Command {
	
	@Override
	public void execute() {
		
	}

	@Override
	public void undo() {
		
	}

}
