package com.itheima;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
	public static void main(String[] args) {
		// 给定一个数组，要求倒序排序
		Integer[] array = {3, 5, 4, 1, 2};

		// 匿名内部类
		Arrays.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		// lambda表达式
		Arrays.sort(array, (Integer o1, Integer o2) -> {
			return o2 - o1;
		});

		// lambda表达式简化版
		Arrays.sort(array, (o1, o2) -> o2 - o1);

		// 方法引用
		// 1. 引用处必须是函数式接口（接口只有一个抽象方法）
		// 2. 被引用的方法必须已经存在
		// 3. 被引用的方法的形参和返回值必须与抽象方法的形参和返回值一致
		// 4. 被引用的方法的功能需要满足当前的要求
		Arrays.sort(array, FunctionDemo1::subtraction);
	}

	public static int subtraction(int a, int b) {
		return b - a;
	}
}
