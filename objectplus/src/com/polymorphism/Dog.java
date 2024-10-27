package com.polymorphism;

public class Dog extends Animal{
	public Dog() {
	}

	public Dog(int age, String color) {
		super(age, color);
	}

	@Override
	public void eat(String something) {
		System.out.printf("%d岁的%s颜色的狗两只前腿死死地抱着%s猛吃\n", getAge(), getColor(), something);
	}

	@Override
	public String getType() {
		return "狗";
	}

	public void lookHome() {
		System.out.println("狗在看家");
	}

}