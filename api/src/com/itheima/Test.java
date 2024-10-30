package com.itheima;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int num : arr2) {
			System.out.print(num + " ");
		}

		// // 1.获取runtime对象
		// Runtime rt = Runtime.getRuntime();

		// // 2.结束JVM
		// rt.exit(0);

		// 3.获取线程数
		// System.out.println(Runtime.getRuntime().availableProcessors());

		Runtime.getRuntime().exec("shutdown -a");


	}
}
