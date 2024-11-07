package com.itheima.threadpool;

public class ThreadPoolTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadPool pool = new ThreadPool();

		for (int x = 0; x < 10; ++x) {
			pool.submit(() -> {
				System.out.println(Thread.currentThread().getName() + "--------->处理了任务");
			});
		}
		Thread.sleep(100);
		pool.shutdown();

	}
}
