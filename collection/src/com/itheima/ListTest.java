package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	public static void main(String[] args) {
		System.out.println("List遍历方式：");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);

		// 1.迭代器遍历
		// 2.增强for循环遍历
		// 3.lambda表达式遍历

		// 4.普通for循环遍历
		System.out.println("普通for循环遍历");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		System.out.println();

		// 5.1列表迭代器遍历（正序）
		System.out.println("列表迭代器遍历（正序）");
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.printf("%d ", iterator.next());
		}
		System.out.println();

		// 5.2列表迭代器遍历（反序）
		System.out.println("列表迭代器遍历（反序）");
		while (iterator.hasPrevious()) {
			System.out.printf("%d ", iterator.previous());
		}
	}
}
