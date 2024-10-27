package com.itheima.string;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	 	// 给定字符串A和B，A中的字符可以向左旋转，如abcde->cdeab；如果旋转后A可以变成B，则返回True
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if (solution(A, B)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean solution(String A, String B) {
		StringBuilder sb = new StringBuilder(A);
		sb.append(A);
		return sb.indexOf(B) != -1;
	}
}