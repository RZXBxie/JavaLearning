package com.itheima.sellticket;

public class Main {
	public static int tickets = 100;
	public static final Object lock = new Object();

	public static void main(String[] args) {
		Window w1 = new Window("Window 1");
		Window w2 = new Window("Window 2");

		w1.start();
		w2.start();
	}

	public static class Window extends Thread {
		public Window(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (true) {
				synchronized (lock) {
					if (tickets > 0) {
						try {
							sleep(30);
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
						tickets--;
						System.out.println(getName() + "正在卖票，还剩" + tickets + "张票");
					} else {
						break;
					}
				}
			}
		}
	}

}
