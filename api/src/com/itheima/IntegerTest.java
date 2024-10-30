package com.itheima;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		Integer j = Integer.valueOf(10);
		System.out.println(i == j);

		System.out.println("=====================");
		Integer i1 = 10;
		Integer i2 = 10;
		System.out.println(i1 + i2);

		//


		System.out.println("=====================");
		LocalDate d1 = LocalDate.of(2002, 12, 24);
		LocalDate d2 = LocalDate.now();
		long days = ChronoUnit.DAYS.between(d1, d2);
		System.out.println("相隔的天数为：" + days);
	}
}
