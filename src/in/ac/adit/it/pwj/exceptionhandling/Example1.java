package in.ac.adit.it.pwj.exceptionhandling;

public class Example1 {
	public static void main(String[] args) {
		
		ExceptionDemo1 demo1 = new ExceptionDemo1();
		demo1.m1();

	}
}

class ExceptionDemo1 {
	public void m1() {
		System.out.println("M1 Method Called..");
		m2();
		System.out.println("M1 Method End..");
	}

	public void m2() {
		System.out.println("M2 Method Called..");
		m3();
		System.out.println("M2 Method End..");
	}

	public void m3() {
		System.out.println("M3 Method Called..");
		m4();
		System.out.println("M3 Method End..");
	}

	public void m4() {
		System.out.println("M4 Method Called..");
		m5();
		System.out.println("M4 Method End..");
	}

	public void m5() {
		System.out.println("M5 Method Called..");
		
		System.out.println("M5 Method End..");
	}
}
