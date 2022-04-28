package in.ac.adit.it.pwj.exceptionhandling;

public class TryCatchFinallyDemo {
	public static void main(String[] args) {

		int value1 = 40;
		int value2 = 20;
		int value3 = 0;
		
		try {
			value3 = value1/value2;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Value 3 = "+value3);
		}
		
	}
}
