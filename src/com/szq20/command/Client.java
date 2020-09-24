package com.szq20.command;

/**
 * 命令模式：新增电视时，只需新增TvOnCommand、TvOffCommand、TvReceiver，符合ocp(开闭原则)
 *   JdbcTemplate：public <T> T query()方法
 * @author suozhenqing
 * @date 2020-08-30
 */
public class Client {
	
	public static void main(String[] args) {
		
		LightReceiver lightReceiver = new LightReceiver();
		Command onCommand = new LightOnCommand(lightReceiver);
		Command offCommand = new LightOffCommand(lightReceiver);
		
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(0, onCommand, offCommand);
		
		// 打开
		remoteController.onButton(0);
		// 关闭
		remoteController.offButton(0);
		// 撤销
		remoteController.undoButton();
	}
}
