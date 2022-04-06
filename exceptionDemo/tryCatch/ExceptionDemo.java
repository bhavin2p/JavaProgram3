package tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		/*String path = "";
		FileInputStream fioFileInputStream = new FileInputStream(path);
		System.out.println("File present");
		
		*/
		//Error
		//CheckedException = compile time
		//UncheckedException = runtime exception
		int a = 10;
		//System.out.println(a/0);

		System.out.println("HelloTest");

		
		int a1[] = {1,34,3,2,45};
		try {
		System.out.println(a1[5]);
		}
		catch (Exception e) {
			System.out.println("Array limit se bahar hai");
		}
	}

}
