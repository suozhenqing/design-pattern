package com.szq10.prototype;

public class Sheep1 {

	private String name;
	private int age;
	private String color;

	public Sheep1(String name, int age, String color) {
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
		return "Sheep1 [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

}
