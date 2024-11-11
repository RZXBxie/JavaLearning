package com.itheima.threadsafety;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {
	//使用锁实现线程安全

	static int ticket = 0;

	static Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				lock.lock();
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
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				lock.unlock();
			}
		}
	}
}
