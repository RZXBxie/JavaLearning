package com.itheima.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(
				3,  // 核心线程数量
				6,  // 最大线程数量
				60, // 空闲线程存活时间
				TimeUnit.SECONDS,  // 时间单位
				new ArrayBlockingQueue<>(3),
				Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.CallerRunsPolicy()
		);

		pool.submit(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		});
		pool.close();


		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
