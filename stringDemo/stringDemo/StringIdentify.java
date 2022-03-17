package stringDemo;

public class StringIdentify {

	public static void main(String[] args) {
		String s1 = "Java"; //746292446
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("Java"); //1072591677
		System.out.println(System.identityHashCode(s2));
		
		String s3 = "Java";
		System.out.println(System.identityHashCode(s3));
		
		String s4 = new String("Java");
		System.out.println(System.identityHashCode(s4));

		
		
	}

}
