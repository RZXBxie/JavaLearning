public class Main {
	private static final Object lock = new Object();
	private static int count = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread(new Printer('A', 0));
		Thread t2 = new Thread(new Printer('B', 1));
		Thread t3 = new Thread(new Printer('C', 2));

		t1.start();
		t2.start();
		t3.start();
	}

	static class Printer implements Runnable {
		private final char character;
		private final int threadId;

		public Printer(char character, int threadId) {
			this.character = character;
			this.threadId = threadId;
		}

		@Override
		public void run() {
			while (count <= 9) {
				synchronized (lock) {
					while (threadId != count % 3) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print(character);
					count++;
					if (count % 3 == 0) System.out.println();

					lock.notifyAll();
				}
			}
		}
	}
}