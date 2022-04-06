import java.util.ArrayList;

public class WrapperExample1 {

	public static void main(String[] args) {
		int a = 20;
		
		Integer jInteger = a;
		Integer i=Integer.valueOf(a);
		
		System.out.println(a + " " + jInteger + " " +i);
		
		Integer a1 = new Integer(200);
		
		int i1 = a1.intValue();
		
		System.out.println(a1 + " " +i1);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("\b10");
	}
			
}
