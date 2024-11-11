package com.itheima;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) {
		/*
		filter() 过滤元素
		limit() 获取前n个元素
		skip() 跳过前n个元素
		distinct() 去重，依赖hashCode和equals方法
		concat() 将两个Stream流合并成一个
		map() 将一种数据类型转换成另一种
		 */

		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "张三丰-1", "张无忌-2", "张强-3", "谢霆锋-4", "谢逊-5", "谢锋-6");

		list.stream()
				.filter(s -> s.startsWith("谢"))
				.filter(s -> s.length() == 3)
				.forEach(s -> System.out.println(s));

		System.out.println("============================");
		list.stream().limit(3).forEach(s -> System.out.println(s));

		System.out.println("============================");
		list.stream().distinct().forEach(s -> System.out.println(s));

		System.out.println("===============================");
		list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));

		// 收集数据到数组中
		System.out.println("===============================");
		String[] array = list.stream().toArray(value -> new String[value]);
		System.out.println(Arrays.toString(array));

		System.out.println("================================");
		// 收集数据到集合中
		List<String> collect = list.stream().collect(Collectors.toList());
		System.out.println(collect);

		// 收集数据到Map中，toMap需要传递两个方法，第一个是键的规则，第二个是值的规则
		System.out.println("===============================");

		// Map<String, Integer> map = list.stream().collect(Collectors.toMap(
		// 		new Function<String, String>() {
		// 			@Override
		// 			public String apply(String s) {
		// 				return s.split("-")[0];
		// 			}
		// 		},
		// 		new Function<String, Integer>() {
		// 			@Override
		// 			public Integer apply(String s) {
		// 				return Integer.parseInt(s.split("-")[1]);
		// 			}
		// 		}
		// ));

		Map<String, Integer> map = list.stream().collect(Collectors.toMap(
				s -> s.split("-")[0],
				s -> Integer.parseInt(s.split("-")[1])
		));
		System.out.println(map);
	}
}
