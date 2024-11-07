package com.itheima.printOdd;

public class Main {
	public static final Object lock = new Object();
	public static int number = 1;

	public static void main(String[] args) {
		Printer t1 = new Printer("线程1");
		Printer t2 = new Printer("线程2");

		t1.start();
		t2.start();
	}

	public static class Printer extends Thread {
		Printer(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (number <= 100) {
				synchronized (lock) {
					System.out.println(getName() + "当前数字：" + number);
					number += 2;
				}
			}
		}
	}
}
