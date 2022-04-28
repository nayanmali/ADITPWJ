package in.ac.adit.it.pwj.threading.Synchronization;

public class Synchronization1 {
	public static void main(String[] args) {

		Table table = new Table();

		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);

		thread1.start();
		thread2.start();
	}
}

class Thread1 extends Thread {
	Table table;

	public Thread1(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(5);
	}
}

class Thread2 extends Thread {
	Table table;

	public Thread2(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(6);
	}
}

class Table {

	public synchronized void printTable(int value) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i + " * " + value + " = " + i * value);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
