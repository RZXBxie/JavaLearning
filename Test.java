public class Test {
	public static void main(String[] args) {
		X t = new X();
		t.start();
	}

	public static class X extends Thread implements Runnable {
		@Override
		public void run() {
			System.out.println("This is run");
		}
	}
}
