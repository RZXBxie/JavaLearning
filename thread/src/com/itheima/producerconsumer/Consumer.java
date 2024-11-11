package com.itheima.producerconsumer;

import static com.itheima.producerconsumer.Buffer.*;

public class Consumer extends Thread {
	public Consumer(String s) {
		super(s);
	}
	@Override
	public void run() {
		while (true){
			synchronized (lock) {
				if (count == 0) {
					break;
				} else {
					if (buffers == 1) {
						System.out.println(getName() + "正在消费数据");
						count--;
						System.out.printf(getName() + "还能消费%d条数据\n", count);
						buffers--;
						lock.notifyAll();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					}
				}
			}
		}
	}
}

