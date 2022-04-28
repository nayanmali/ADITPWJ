package in.ac.adit.it.pwj.threading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample1 {

	public static void main(String[] args) {
		
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("Core : "+core);
		
		ExecutorService executors = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i<1000; i++) {
			executors.execute(new ThreadPoolTask());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadPoolTask implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
