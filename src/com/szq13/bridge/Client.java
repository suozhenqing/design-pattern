package com.szq13.bridge;
/**
 * 桥接模式：
 *   1.抽象和实现部分的分离，使系统灵活性增加，基于类的最小原则，替代多层继承方案
 *   2.应用场景
 *     jdbc中驱动程序：driver-mysql，driver-oracle
 *     银行转账系统：转账(网上转账、柜台转账)、用户(普通用户、vip用户)
 *     消息管理：消息类型(即时、延时)、消息分类(手机消息、邮件消息)
 * @author suozhenqing
 * @date 2020-08-25
 */
public class Client {
	
	public static void main(String[] args) {
		
		// 样式 + 手机
		Phone phone1 = new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.call();
		phone1.close();
		System.out.println("----------------");
		
		Phone phone2 = new FoldedPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		System.out.println("----------------");
		
		Phone phone3 = new UpRightPhone(new XiaoMi());
		phone3.open();
		phone3.call();
		phone3.close();
		System.out.println("----------------");
		
		Phone phone4 = new UpRightPhone(new Vivo());
		phone4.open();
		phone4.call();
		phone4.close();
	}
}
