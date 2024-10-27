package com.itheima;

public class Test {
	public static void main(String[] args) {
		new Swim() {
			@Override
			public void swim() {
				System.out.println("我是匿名内部类，实现了游泳的接口");
			}
		};

		method(
				new Animal() {
					@Override
					public void eat() {
						System.out.println("够吃骨头");
					}
				}
		);

	}

	public static void method(Animal a) {
		a.eat();
	}
}
