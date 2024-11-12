package com.itheima.myReflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// 1.获取所有的公共的构造方法
		Class clazz = Class.forName("com.itheima.myReflect2.Student");
		Constructor[] cons = clazz.getConstructors();

		// 2.获取所有的构造方法
		Constructor[] cons2 = clazz.getDeclaredConstructors();
		// for (Constructor c : cons2) {
		// 	System.out.println(c);
		// }

		// 3.获取单个构造方法
		Constructor cons3 = clazz.getDeclaredConstructor(String.class, int.class);
		// System.out.println(cons3);

		// 4.暴力反射：临时取消权限校验并创建对象
		Constructor cons4 = clazz.getDeclaredConstructor(String.class, int.class);
		cons4.setAccessible(true);
		Student stu = (Student) cons4.newInstance("张三", 23);
		System.out.println(stu);
	}
}
