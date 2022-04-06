package tryCatch;

public class ThrowsDemo {
	
	//Monali
	public static int divide(int a, int b) {
		int result = 0;
		try {
		  result = a/b;
	
		}
		catch (Exception e) {
			System.out.println("divide by zero");
		}
		return result;
	}
	

	public static void main(String[] args) {
			int c = divide(10, 0);
			System.out.println(c);
	}

}
