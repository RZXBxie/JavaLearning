package com.itheima.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	// 线程池默认线程数
	private static final int DEFAULT_THREAD_POOL_SIZE = 2;

	// 线程池实际线程数
	private int threadPoolSize = DEFAULT_THREAD_POOL_SIZE;

	// 任务队列
	private BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<Runnable>();

	// 线程池是否关闭
	private boolean isShutdown = false;

	public ThreadPool() {
		this.initThreadPool();
	}
	
	public ThreadPool(int threadPoolSize) {
		if (threadPoolSize > 0) {
			this.threadPoolSize = threadPoolSize;
		}
		this.initThreadPool();
	}

	private void initThreadPool() {
		for (int x = 0; x < threadPoolSize; x++) {
			new TaskThread("线程---->" + x).start();
		}
	}

	public void submit(Runnable task) {
		if (isShutdown) {
			throw new IllegalStateException("线程池已经关闭，无法提交任务");
		}
		try {
			taskQueue.put(task);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void shutdown() {
		isShutdown = true;
		// 中断所有正在执行的线程
		for (Thread thread : Thread.getAllStackTraces().keySet()) {
			if (thread.getName().startsWith("线程---->")) {
				thread.interrupt();
			}
		}
	}

	private class TaskThread extends Thread {
		public TaskThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (!isShutdown) {
				try {
					Runnable task = taskQueue.take();
					task.run();
				} catch (InterruptedException e) {
					if (isShutdown) {
						return;
					}
					e.printStackTrace();
				}
			}
		}
	}
}
