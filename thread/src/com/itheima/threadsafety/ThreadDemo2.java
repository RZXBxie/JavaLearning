package com.itheima.threadsafety;

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyRunnable1 mr =  new MyRunnable1();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
