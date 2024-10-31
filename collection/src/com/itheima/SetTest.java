package com.itheima;


import objectOriented.GirlFriend;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("a");

		Iterator<String> it = set.iterator();

		TreeSet<GirlFriend> s = new TreeSet<>();
		s.add(new GirlFriend("li hua", 22, "nan"));
		s.add(new GirlFriend("a hua", 22, "nan"));
		for (GirlFriend girlFriend : s) System.out.println(girlFriend);

		System.out.println("===========================");
		TreeSet<String> s2 = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) return o1.length() - o2.length();
				return o1.compareTo(o2);
			}
		});

		TreeSet<String> s3 = new TreeSet<>((o1, o2) -> {
			if (o1.length() != o2.length()) return o1.length() - o2.length();
			return o1.compareTo(o2);
		});
	}
}
