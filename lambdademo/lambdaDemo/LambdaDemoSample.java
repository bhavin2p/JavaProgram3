package lambdaDemo;

interface demo1{
	void meth();
}

public class LambdaDemoSample {

	public static void main(String[] args) {
		
		
		demo1 s1 = ()->{
			System.out.println("Hello ");
		};
		s1.meth();
	}

}
