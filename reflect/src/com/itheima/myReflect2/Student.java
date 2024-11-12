package com.itheima.myReflect2;

public class Student {
	private String name;
	private int age;

	public Student() {}

	public Student(String name) {
		this.name = name;
	}

	protected Student(int age) {
		this.age = age;
	}

	private Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
