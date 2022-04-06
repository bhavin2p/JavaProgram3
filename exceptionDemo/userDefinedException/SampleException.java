package userDefinedException;

public class SampleException {

	public static void main(String[] args) {
		try {
			throw new UserException(300);
			
		}catch (UserException e) {
			System.out.println(e);
		}
	}
}
