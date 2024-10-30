package com.itheima;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger(10, new Random());
		System.out.println(b1);
		BigInteger b2 = new BigInteger("22222222222222222222222222222222222222222");
		System.out.println(b1.add(b2).intValue());
		System.out.println(b2.pow(2));
	}
}
