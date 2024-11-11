package com.itheima.threadsafety;

public class MyThread1 extends Thread {
	// 1.使用同步代码块实现线程安全

	static int ticket = 0;

	// 锁对象，一定要是唯一的
	static final Object lock = new Object();
	@Override
	public void run() {
		while (true) {
			synchronized (MyThread1.class) {
				if (ticket < 100) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ticket++;
					System.out.println(Thread.currentThread().getName() + ": " + ticket);
				} else {
					break;
				}
			}
		}
	}
}
