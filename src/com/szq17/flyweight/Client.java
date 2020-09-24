package com.szq17.flyweight;
/**
 * 享元模式：线程池、数据库连接池
 * @author suozhenqing
 * @date 2020-08-28
 */
public class Client {
	
	public static void main(String[] args) {
		
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		WebSite webSite1 = webSiteFactory.getWebSite("新闻");
		webSite1.use(new User("tome"));
		
		WebSite webSite2 = webSiteFactory.getWebSite("博客");
		webSite2.use(new User("jack"));
		
		WebSite webSite3 = webSiteFactory.getWebSite("博客");
		webSite3.use(new User("marin"));
		
		WebSite webSite4 = webSiteFactory.getWebSite("博客");
		webSite4.use(new User("lisa"));
		
		System.out.println("网站分类---->" + webSiteFactory.getCount());
		
		System.out.println(Integer.valueOf(12) == Integer.valueOf(12));
		System.out.println(Integer.valueOf(200) == Integer.valueOf(200));
	}
}
