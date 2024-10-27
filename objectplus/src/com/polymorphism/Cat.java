package com.polymorphism;

public class Cat extends Animal{
	public Cat() {

	}

	public Cat(int age, String color) {
		super(age, color);
	}

	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}

	@Override
	public void eat(String something) {
		System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s\n", getAge(), getColor(), something);
	}

	@Override
	public String getType() {
		return "猫";
	}
}
