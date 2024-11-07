package com.itheima.producerconsumer;

import static com.itheima.producerconsumer.Buffer.*;

public class Producer extends Thread{
	public Producer(String s) {
		super(s);
	}

	@Override
	public void run() {
		while (true){
			synchronized (lock) {
				if (count == 0) {
					break;
				} else {
					if (buffers == 0) {
						System.out.println(getName() + "生产者生产数据");
						buffers = 1;
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
