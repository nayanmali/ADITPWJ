package in.ac.adit.it.pwj.exceptionhandling;

public class ExceptionHandlingMethods {
	public static void main(String[] args) {
		DemoExample demoExample = new DemoExample();
		demoExample.getMessageDemo();
		demoExample.toStringDemo();;
		demoExample.printStackTraceDemo();
	}
}

class DemoExample {

	int value1 = 10;
	int value2 = 20;
	int value3;

	public void getMessageDemo() {
		try {
			value3 = value1 / value2;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void toStringDemo() {
		try {
			value3 = value1 / value2;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void printStackTraceDemo() {
		try {
			value3 = value1 / value2;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
