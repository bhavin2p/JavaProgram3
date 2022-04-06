package customException;

import java.io.IOException;

public class TestThrow {
	
	public static void testAdd() {
		int a =30;
		if(a<20) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("TEst");
		}
		
	}

	public static void main(String[] args) {
		testAdd();		

	}

}
