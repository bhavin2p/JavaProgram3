package tryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo1 {

	public static void ArrayDemo() throws ArrayIndexOutOfBoundsException {
		int a[] = { 10, 30, 40 };

		System.out.println(a[4]);

	}

	public static void accessFile() throws FileNotFoundException {
		String path = "";
		FileInputStream file = new FileInputStream(path);
	}

	public static void main(String[] args) throws FileNotFoundException {

			accessFile();
		
	}

}
