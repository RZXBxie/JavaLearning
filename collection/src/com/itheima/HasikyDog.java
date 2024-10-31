package com.itheima;

public class HasikyDog extends Dog{
	@Override
	public void eat() {
		System.out.printf("一只叫做%s的，%d岁的哈士奇，正在吃骨头，边吃变拆家", this.getName(), this.getAge());
	}
}
