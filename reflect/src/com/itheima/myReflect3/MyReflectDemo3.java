package com.itheima.myReflect3;

import java.lang.reflect.Field;

public class MyReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		// 1.获取公共字段
		Class clazz = Class.forName("com.itheima.myReflect3.Student");
		Field[] fields = clazz.getFields();


		// 2.获取所有字段
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}

		// 3.获取单个成员变量
		Field name = clazz.getDeclaredField("name");
		System.out.println(name);

		// 4.获取成员变量的类型
		Class<?> type = name.getType();
		System.out.println(type);

		// 5.改变对象的私有成员变量的值
		Student stu = new Student("zhangsan", 23, 1);
		name.setAccessible(true);
		String value = (String) name.get(stu);
		System.out.println(value);
		System.out.println(stu);

		// 6.更改对象的成员变量的值
		name.set(stu, "lisi");
		System.out.println(stu);
	}
}
