package com.itheima;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("1.00");
		BigDecimal b2 = new BigDecimal("2.00");
		System.out.println(b1.add(b2));
	}
}
