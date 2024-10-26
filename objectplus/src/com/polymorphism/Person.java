package com.polymorphism;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	public void keepPet(Animal animal, String something) {
		if (animal instanceof Dog dog) {
			System.out.printf("年龄为%d岁的%s饲养了一只%s颜色的%d岁的%s\n", getAge(), getName(), animal.getColor(), animal.getAge(), animal.getType());
			dog.eat(something);
			dog.lookHome();
		} else if (animal instanceof Cat cat) {
			System.out.printf("年龄为%d岁的%s饲养了一只%s颜色的%d岁的%s\n", getAge(), getName(), animal.getColor(), animal.getAge(), animal.getType());
			cat.eat(something);
			cat.catchMouse();
		}
	}
}
