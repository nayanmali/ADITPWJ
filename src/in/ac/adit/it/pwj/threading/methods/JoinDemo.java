package in.ac.adit.it.pwj.threading.methods;

public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("Running " + Thread.currentThread().getName());

		System.out.println("Creating New Thread");

		Example example1 = new Example();
		Example example2 = new Example();

		example1.setName("Example 1");
		example2.setName("Example 2");



		example1.start();
		
		
		try {
			example1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		example2.start();
	}
}

class Example extends Thread {
	public void run() {
		System.out.println("Running " + Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}