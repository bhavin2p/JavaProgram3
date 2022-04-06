package nestedIfCondition;

public class NestedIf {

	public static void main(String[] args) {
		int a=10, b=10, c=30, d=40;
		
		if(a==b) {
			System.out.println("A is equal to B");
		} else {
			System.out.println("a is not equal to B");
		} if(b==c) {
			System.out.println("B is equal to C");
		} else {
			System.out.println("b is not equal to c");
		} if(c==d) {
			System.out.println("c is equal to d");
		} else {
			System.out.println("c is not equal to d");
		}

	}

}
