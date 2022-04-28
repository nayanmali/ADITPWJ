package in.ac.adit.it.pwj.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * UnChecked Exception Example
 */

public class Checked {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream(new File("D:\\demo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
