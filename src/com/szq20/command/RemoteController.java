package com.szq20.command;

public class RemoteController {
	
	// 开、关按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;
	
	// 执行撤销的命令
	Command undoCommand;
	
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	public void setCommand(int number, Command onCommand, Command offCommand) {
		onCommands[number] = onCommand;
		offCommands[number] = offCommand;
	}
	
	public void onButton(int number) {
		onCommands[number].execute();
		undoCommand = onCommands[number];
	}
	
	public void offButton(int number) {
		offCommands[number].execute();
		undoCommand = offCommands[number];
	}
	
	// 撤销按钮，只允许撤销一次
	public void undoButton() {
		undoCommand.undo();
	}
}
