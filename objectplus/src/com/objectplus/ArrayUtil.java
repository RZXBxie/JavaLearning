package com.objectplus;

import java.util.StringJoiner;

public class ArrayUtil {
	public static String printArr(int[] array) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		for (int num : array) {
			sj.add(String.valueOf(num));
		}
		return sj.toString();
	}

	public static double getAverage(double[] array){
		double sum = 0;
		for (double num : array){
			sum += num;
		}
		return sum/array.length;
	}
}
