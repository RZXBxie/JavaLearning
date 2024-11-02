package com.itheima;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		/*
		单列集合				default Stream<E> stream()     					Collection中的默认方法
		双列集合				无法直接使用stream流
		数组				public static<T> Stream<T> stream(T[])			Arrays工具类中的静态方法
		一堆零散数据			public static<T> Stream<T> stream(T... values)	Stream接口中的静态方法
		 */
		// 单列集合使用Stream
		System.out.println("单列集合使用Stream");
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "abc", "def", "ghi", "jkl");
		Stream<String> stream = list.stream();
		// Stream流的终结方法
		stream.forEach(s-> System.out.printf("%s ", s));
		System.out.println();

		System.out.println("===================================");

		// 双列集合使用Stream
		System.out.println("双列集合使用Stream");
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("a", 1);
		hmap.put("b", 2);
		hmap.put("c", 3);
		hmap.put("d", 4);
		Set<Map.Entry<String, Integer>> entrySet = hmap.entrySet();
		entrySet.stream().forEach(s -> System.out.println(s));

		System.out.println("===================================");

		// 数组使用Stream
		System.out.println("数组使用Stream");
		int[] array = {1, 2, 3, 4, 5};
		IntStream stream1 = Arrays.stream(array);
		stream1.forEach(i -> System.out.println(i));

		System.out.println("===================================");

		// 一堆零散数据使用Stream
		Stream<String> stringStream = Stream.of("111", "222", "333");
		stringStream.forEach(s -> System.out.println(s));

		System.out.println("=======================");
	}
}
