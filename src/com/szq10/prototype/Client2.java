package com.szq10.prototype;
/**
 * 1.创建对象的五种方式
 *   1-1 Object obj = new Object();
 *   1-2 Person p2 = (Person) Class.forName("com.ys.test.Person").newInstance();
 *   1-3 Person p3 = (Person) Person.class.getConstructors()[0].newInstance();
 *   1-4 Person p4 = (Person) p3.clone();
 *   1-5 序列化是把堆内存中的 Java对象数据，通过某种方式把对象存储到磁盘文件中或者传递给其他网络节点（在网络上传输）。
 *       而反序列化则是把磁盘文件中的对象数据或者把网络节点上的对象数据，恢复成Java对象模型的过程。
 * 2.基本类型直接在栈中存储数值，而引用类型是将引用放在栈中，实际存储放在堆中，通过栈中的引用指向堆中存放的数据
 * 3.原型模式(spring --> bean.xml --> scope)
 *   优点：通过克隆方式创建多个对象，需要注意引用类型深拷贝
 *   缺点：需要对每个类配备克隆方法，对新增类无影响，但对已有类新增克隆方法时，违背了ocp原则
 * 4.深拷贝
 *   4-1 重写clone方法
 *   4-2 对象序列化，如某属性不需要序列化，则用transient修饰
 * @author suozhenqing
 * @date 2020-08-23
 */
public class Client2 {
	
	public static void main(String[] args) {
		
		/*Sheep2 sheep1 = new Sheep2("tom", 2, "白色");
		sheep1.friend = new Sheep2("jack", 3, "黑色");
		Sheep2 sheep2 = (Sheep2) sheep1.clone();
		Sheep2 sheep3 = (Sheep2) sheep1.clone();
		Sheep2 sheep4 = (Sheep2) sheep1.clone();
		Sheep2 sheep5 = (Sheep2) sheep1.clone();
		
		System.out.println(sheep1 + "--" + sheep1.friend.hashCode());
		System.out.println(sheep2 + "--" + sheep2.friend.hashCode());
		System.out.println(sheep3 + "--" + sheep3.friend.hashCode());
		System.out.println(sheep4 + "--" + sheep4.friend.hashCode());
		System.out.println(sheep5 + "--" + sheep5.friend.hashCode());*/
		
		/*Sheep2 sheep1 = new Sheep2("tom", 2, "白色");
		sheep1.address = new Address("河南", "郑州");
		Sheep2 sheep2 = (Sheep2) sheep1.clone();
		Sheep2 sheep3 = (Sheep2) sheep1.clone();
		Sheep2 sheep4 = (Sheep2) sheep1.clone();
		Sheep2 sheep5 = (Sheep2) sheep1.clone();
		
		System.out.println(sheep1 + "-->" + sheep1.address.hashCode());
		System.out.println(sheep2 + "-->" + sheep2.address.hashCode());
		System.out.println(sheep3 + "-->" + sheep3.address.hashCode());
		System.out.println(sheep4 + "-->" + sheep4.address.hashCode());
		System.out.println(sheep5 + "-->" + sheep5.address.hashCode());*/
		
		Sheep2 sheep1 = new Sheep2("tom", 2, "黑色");
		sheep1.address = new Address("浙江", "杭州");
		Sheep2 sheep2 = (Sheep2) sheep1.deepClone();
		Sheep2 sheep3 = (Sheep2) sheep1.deepClone();
		Sheep2 sheep4 = (Sheep2) sheep1.deepClone();
		Sheep2 sheep5 = (Sheep2) sheep1.deepClone();
		
		System.out.println(sheep1 + "-->" + sheep1.address.hashCode());
		System.out.println(sheep2 + "-->" + sheep2.address.hashCode());
		System.out.println(sheep3 + "-->" + sheep3.address.hashCode());
		System.out.println(sheep4 + "-->" + sheep4.address.hashCode());
		System.out.println(sheep5 + "-->" + sheep5.address.hashCode());
	}
}
