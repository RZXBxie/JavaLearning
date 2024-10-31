package com.itheima;

public class TidyDog extends Dog{
	@Override
	public void eat() {
		System.out.printf("一只叫做%s的，%d岁的泰迪，正在吃骨头，边吃边蹭", this.getName(), this.getAge());
	}
}
