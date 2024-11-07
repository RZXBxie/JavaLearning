package com.itheima;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// MyThread t1 = new MyThread();
		// t1.setName("thread 1");
		//
		// MyThread t2 = new MyThread();
		// t2.setName("thread 2");
		//
		// t1.start();
		// t2.start();
		//
		//
		// MyRun r1 = new MyRun();
		// Thread t = new Thread(r1);
		// t.start();

		// Thread t = Thread.currentThread();
		// System.out.println(t.getName());

		MyCallable callable = new MyCallable();
		FutureTask<Integer> futureTask = new FutureTask<>(callable);
		Thread t = new Thread(futureTask);
		t.start();
		Integer result = futureTask.get();
		System.out.println(result);
	}
}
