package com.itheima.myReflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflectDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class<?> clazz = Class.forName("com.itheima.myReflect4.Student");
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("================================");

		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}

		System.out.println("================================");

		Method declaredMethod = clazz.getDeclaredMethod("eat", String.class);
		System.out.println(declaredMethod);

		// 运行获取到的方法
		Student s = new Student();
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(s, "汉堡");

	}
}
