package com.itheima.string;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		int[] nums = {1, 2, 3};
		for (int num : nums) {
			sj.add(String.valueOf(num));
		}
		String result = sj.toString();
		System.out.println(sj);
		System.out.println(result);
	}
}
