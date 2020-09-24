package com.szq10.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sheep2 implements Cloneable, Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String color;
	
	// 引用类型，需要深拷贝，重写clone()
	//public Sheep2 friend;
	
	public Address address;

	public Sheep2(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep2 [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	/**
	 * 默认克隆方法，浅拷贝，只拷贝基本数据类型，引用类型指向相同的内存地址
	 */
	/*@Override
	protected Object clone() {
		Sheep2 sheep2 = null;
		try {
			sheep2 = (Sheep2) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(e.getMessage());
		}
		return sheep2;
	}*/
	/**
	 * 重写克隆方法，深拷贝
	 */
	@Override
	protected Object clone() {
		Object object = null;
		try {
			object = super.clone();
			Sheep2 sheep2 = (Sheep2) object;
			// 引用类型属性处理
			sheep2.address = (Address) address.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(e.getMessage());
		}
		return object;
	}
	/**
	 * 对象序列化
	 */
	public Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis =null;
		ObjectInputStream ois = null;
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			// 反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			Sheep2 deep = (Sheep2) ois.readObject();
			return deep;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
