package com.itheima.myReflect1;

public class MyReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1.通过Class.forName方式获取
		Class<?> student = Class.forName("com.itheima.myReflect1.Student");
		System.out.println(student);

		// 2.类名.class
		System.out.println(student == Student.class);

		// 3. 对象.getClass()方式获取
		Student stu = new Student();
		System.out.println(stu.getClass());

		String s = "hello";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
	}
}
