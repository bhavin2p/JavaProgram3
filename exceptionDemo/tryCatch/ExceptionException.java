package tryCatch;

import java.awt.image.ImagingOpException;

public class ExceptionException {

	public static void main(String[] args) {
		
		try {
			System.out.println("No Error");
			try {
			int a = 10;
			System.out.println(a/0);
			}
			catch (Exception e) {
				System.out.println("Arithmatic");
			}
		}
		catch (ArithmeticException e) {
			try {
			int arr[] = {10,20};
			System.out.println(arr[2]);
			}
			catch (Exception e1) {
				System.out.println("Array index error");
			}
		}
		catch(ImagingOpException e) {
			System.out.println("Timepass");
		}
		catch(Exception e) {
			System.out.println("Main parent class Exception");
		}
		
		System.out.println("After try catch");
		

	}

}
