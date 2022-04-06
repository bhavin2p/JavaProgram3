package customException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a ;
		
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		if (a<99) {
			try {
				//throw new MyException();
				throw new ArithmeticException("This is an Exception");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
