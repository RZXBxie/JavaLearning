package com.itheima.threadsafety;

public class MyRunnable1 implements Runnable {
	int ticket = 0;
	@Override
	public void run() {
		while (true) {
			if (sellTicket()) break;
		}
	}

	private synchronized boolean sellTicket() {
		if (ticket == 100) {
			return true;
		} else {
			ticket++;
			System.out.println(Thread.currentThread().getName() + "ticket:" + ticket);
		}
		return false;
	}
}
