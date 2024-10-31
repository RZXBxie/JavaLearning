package com.itheima;

import java.util.ArrayList;

public class GenericsTest {
	public static void main(String[] args) {
		ArrayList<BossCat> list1 = new ArrayList<>();
		list1.add(new BossCat("xiao bo", 2));

		ArrayList<LihuaCat> list2 = new ArrayList<>();
		list2.add(new LihuaCat("li hua", 3));

		keepPet(list1);

	}

	public static void keepPet(ArrayList<? extends Cat> list) {
		for (Cat cat : list) {
			System.out.println(cat);
			cat.eat();
		}
	}
}
