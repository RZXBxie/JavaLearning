package com.xf;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	private static final int DEFAULT_THREAD_POOL_SIZE = 16;
	private int threadPoolSize = DEFAULT_THREAD_POOL_SIZE;
	private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
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

	public void submit(Runnable task) {
		if (isShutdown) {
			throw new IllegalStateException("ThreadPool is closed");
		}
		try {
			queue.put(task);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void shutdown() {
		this.isShutdown = true;
		for (Thread thread : Thread.getAllStackTraces().keySet()) {
			if (thread.getName().startsWith("线程---->")) {
				thread.interrupt();
			}
		}
	}

	private void initThreadPool() {
		for (int i = 0; i < threadPoolSize; i++) {
			new TaskThread("线程--------->" + i).start();
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
					Runnable task = queue.take();
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
