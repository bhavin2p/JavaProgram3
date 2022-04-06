package userDefinedException;

public class UserException extends Exception {

	int num1;

	UserException(int num2) {
		num1 = num2;
	}

	public String toString() {
		return ("Status code = " + num1);
	}

}
