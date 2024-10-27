package com.itheima.string;

// 适用场景：
// 1. 字符串拼接：效率比String更高
// 2. 字符串反转

public class StringBuilderDemo {
	public static void main(String[] args) {
		// StringBuilder sb = new StringBuilder();
		// System.out.printf("长度为: %d，容量为：%d\n", sb.length(), sb.capacity());
		// sb.append("hello, world");
		// System.out.printf("长度为: %d，容量为：%d\n", sb.length(), sb.capacity());
		//
		// StringBuilder sb1 = new StringBuilder("hello, world");
		// System.out.printf("长度为: %d，容量为：%d\n", sb1.length(), sb1.capacity());
		// // append
		// sb.append("!");
		//
		// // reverse
		// sb.reverse();
		// System.out.println(sb);

		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + ", " + b);
	}

	public static void operate(StringBuffer a, StringBuffer b) {
		b.append(a);
		b = a;
	}
}
