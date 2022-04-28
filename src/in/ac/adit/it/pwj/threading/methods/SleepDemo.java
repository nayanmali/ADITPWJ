package in.ac.adit.it.pwj.threading.methods;

public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("Running " + Thread.currentThread().getName());
		
		System.out.println("Creating New Thread");
		
		MyThread myThread = new MyThread();
		myThread.start();		
		
		MyThread myThread1 = new MyThread();
		myThread.setName("My Thread 1");
		myThread1.start();
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
