package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionDemo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "1", "2", "3", "4");
		List<Integer> list1 = list.stream().map(Integer::parseInt).toList();
		System.out.println(list1);


	}
}