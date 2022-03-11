package catchDemo;

public class CatchBlockException {

	public static void main(String[] args) {
		
		int a[] = {1,3,4,5,6,7};
		
		try {
			int i=12;
			int result;
			result = i/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero error");
			try {
			System.out.println(a[7]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("Index out of range");
				//e1.printStackTrace();
			}
		}
		finally {
			try {
			System.out.println(a[7]);
			System.out.println("I will execute always ");
			}
			catch (Exception e) {
				System.out.println("range out of bound");
			}
			finally {
				System.out.println("inside finally another finally");
			}
		}
		
		

	}

}
