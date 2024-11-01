package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		Integer value = myMap.put("one", 1);
		System.out.println(value);
		myMap.put("two", 2);
		System.out.println(myMap.containsValue(2));

		System.out.println("=============Map遍历方式==============");
		myMap.put("three", 3);
		myMap.put("four", 4);
		System.out.println("通过键找值：");
		Set<String> keys = myMap.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + myMap.get(key));
		}
		System.out.println();
		System.out.println("通过键值对遍历：");
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();
		System.out.println("通过forEach遍历：");
		myMap.forEach((k, v) -> System.out.println(k + ":" + v));
		myMap.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String s, Integer integer) {
				System.out.println(s + ":" + integer);
			}
		});
	}


}
