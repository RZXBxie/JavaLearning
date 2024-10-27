package com.itheima;

public abstract class Person {
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
}

abstract class Player extends Person {
	public Player() {
	}

	public Player(String name, int age) {
		super(name, age);
	}

	public abstract void learn();
}

abstract class Coach extends Person {
	public Coach() {
	}

	public Coach(String name, int age) {
		super(name, age);
	}

	public abstract void teach();
}

interface English {
	void say();
}

class TennisPlayer extends Player implements English {
	public TennisPlayer() {
	}

	public TennisPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.println("运动员说英语");
	}

	@Override
	public void learn() {
		System.out.println("学习乒乓球");
	}
}

class BasketBallPlayer extends Player {
	public BasketBallPlayer() {
	}

	public BasketBallPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void learn() {
		System.out.println("学打篮球");
	}
}

class TennisCoach extends Coach implements English {
	public TennisCoach() {
	}

	public TennisCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("教打乒乓球");
	}

	@Override
	public void say() {
		System.out.println("教练说英语");
	}
}

class BasketBallCoach extends Coach {
	public BasketBallCoach() {
	}

	public BasketBallCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("教打篮球");
	}
}