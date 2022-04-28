package in.ac.adit.it.pwj.exceptionhandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		
		int value1 = 10;
		int value2 =  0;
		int value3;
		
		try{
			value3 = value1/value2;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
