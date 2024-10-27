package com.objectplus;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		// 打印数组
		int[] array = {1, 2, 3, 4, 5};
		String s = ArrayUtil.printArr(array);
		System.out.println(s);

	    // 获取平均值
		double[] nums = {1.0, 2.0, 3.0};
		System.out.println(ArrayUtil.getAverage(nums));
	}
}