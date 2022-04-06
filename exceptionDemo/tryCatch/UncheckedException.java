package tryCatch;

public class UncheckedException {
	
	//Syntax Error
	//Logical Error
	//Runtime Error = exceptions [checked and unchecked exception] - try catch / throws / throw(user defined exception)
	// finally
	public static void main(String[] args) {
		
		int a = 10;
		try {
		int result = a/0;
		System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("number cannot be divide by zero");
		}
		System.out.println("next line after catch");
	}

}
