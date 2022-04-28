package in.ac.adit.it.pwj.threading.methods;

public class YieldDemo extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}

	public static void main(String[] args) {
		YieldDemo t1 = new YieldDemo();
		YieldDemo t2 = new YieldDemo();

		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			t1.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}