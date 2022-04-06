package finallyDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fioFileInputStream = null;
		try {
			String arr[] = {"Dineo","Monali","Suzen","Lerato"};
			
			String path = "";
			fioFileInputStream = new FileInputStream(path);
			System.out.println("File present");
			fioFileInputStream.read();
			
			
			
			System.out.println(arr[5] + "OK");
		}
		
		catch (Exception e) {
			System.out.println("Exception in above arry");
		}
		finally {
			fioFileInputStream.close();
			System.out.println("I am Lerato in office on Sunday");
		}
		
	}

}
