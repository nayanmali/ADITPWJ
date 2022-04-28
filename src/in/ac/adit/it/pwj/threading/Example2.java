package in.ac.adit.it.pwj.threading;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Running " + Thread.currentThread().getName());
		
		System.out.println("Creating New Thread");
		
		DemoThread demoThread = new DemoThread();		
		
		/*
		 * Passing object to Thread Class
		 */
		Thread thread = new Thread(demoThread);
		thread.start();	
	}
}

class DemoThread implements Runnable{
	public void run() {
		System.out.println("Running " + Thread.currentThread().getName());
	}
}
