package com.itheima;

public class BossCat extends Cat{
	public BossCat() {
	}

	public BossCat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.printf("一只叫做%s的，%d岁的波斯猫，正在吃小饼干", this.getName(), this.getAge());
	}
}
