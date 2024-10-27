package com.itheima;

public abstract class Animal {
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
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

	public abstract void eat();
}

interface Swim {
	int count = 0;

	// public abstract
	void swim();
}

class Dog extends Animal implements Swim {
	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("吃骨头");
	}

	@Override
	public void swim() {
		System.out.println("狗刨");
	}
}

class Frog extends Animal implements Swim {
	public Frog() {
	}

	public Frog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("吃虫子");
	}

	@Override
	public void swim() {
		System.out.println("蛙泳");
	}
}

class Rabbit extends Animal {
	public Rabbit() {
	}

	public Rabbit(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("吃胡萝卜");
	}
}
