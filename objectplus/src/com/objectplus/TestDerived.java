package com.objectplus;

import java.io.IOException;
import java.util.Scanner;

public class TestDerived {
	public static void main(String[] args) throws IOException {
		Son s = new Son();
		System.out.println(s);

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();



	}
}

class Father {
	int a = 0x111;
	private int b = 0x222;

	public void fatherShow1() {
		System.out.println("fatherShow1");
	}

	private void fatherShow2() {
		System.out.println("fatherShow2");
	}
}

class Son extends Father {
	int c = 0x333;

	public void sonShow() {
		System.out.println("sonShow");
	}
}
