package tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\eclipse-java-2021-03-R-win32-x86_64\\test websites.txt";
		FileInputStream fio = new FileInputStream(path);
		System.out.println("next line");

	}

}
