package customException;

public class MyException extends Exception {

	public String toString() {
		return toString() + " I am toString()";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMessage() + "I am get message";
	}
	
	
}
