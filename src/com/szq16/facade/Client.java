package com.szq16.facade;
/**
 * 外观模式：将方法进行封装，客户端无需关心子系统内部细节
 * @author suozhenqing
 * @date 2020-08-27
 */
public class Client {
	
	public static void main(String[] args) {
		
		HomeFacade homeFacade = new HomeFacade();
		homeFacade.ready();
		homeFacade.play();
		homeFacade.off();
	}
}
