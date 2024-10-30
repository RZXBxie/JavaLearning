package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest {
	public static void main(String[] args) {
		/*
		Collection是一个接口，不能实例化他的对象，只能实例化实现它的类的对象
		 */
		Collection<String> coll = new ArrayList<>();
		coll.add("A");
		coll.add("B");
		coll.add("C");

		System.out.println("===============Collection 遍历方式================");
		// 1. 迭代器遍历
		System.out.println("迭代器遍历：");
		Iterator<String> it = coll.iterator();
		while (it.hasNext()) {
			System.out.printf("%s ", it.next());
		}
		System.out.println();

		// 2.增强for循环遍历
		System.out.println("增强for循环遍历：");
		for (String s : coll) {
			System.out.printf("%s ", s);
		}
		System.out.println();

		// 3.1 匿名内部类遍历
		System.out.println("匿名内部类遍历：");
		coll.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.printf("%s ", s);
			}
		});
		System.out.println();

		// 3.2 lambda表达式遍历
		System.out.println("lambda表达式遍历：");
		coll.forEach(s -> System.out.printf("%s ", s));
	}
}
