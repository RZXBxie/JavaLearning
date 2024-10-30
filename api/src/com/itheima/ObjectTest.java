package com.itheima;

import java.util.Objects;

public class ObjectTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		public String toString();          // 返回对象的字符串形式，子类需要重写
		public boolean equals(Object obj); // 比较两个对象是否相等
		protected Object clone(int a);     // 对象克隆
		 */

		// Object obj = new Object();
		// String s1 = "xiefeng";
		// StringBuilder s2 = new StringBuilder("xiefeng");
		// System.out.println(s1.equals(s2));  // false
		// System.out.println(s2.equals(s1));  // false

		int[] data = {1, 2, 3, 4, 5};
		User u1 = new User(1, "xiefeng", "1234qwer", "girl11", data);
		User u2 = (User) u1.clone();
		System.out.println(u1);
		System.out.println(u2);

		System.out.println(Objects.equals(u1, u2));

	}
}
