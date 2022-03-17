package stringDemo;

public class StringMethods {

	public static void main(String[] args) {
		//0=M / 1=0
		int a = 10;
		int b = 10;
		if(a==b) {
			System.out.println("A is equal to B");
		}
		else {
			System.out.println("A is not equal to B");
		}
		
		
		String s = "MOnAli";
		String s3 = "monali";
		
		if(s.equalsIgnoreCase("MoNaLi")) {
			System.out.println("S is equal to S3");
		}
		else {
			System.out.println("S is not equal to S3");
		}
		System.out.println(s.toLowerCase());
		
		int len = s.length();
		System.out.println(len);
		String surname = " Bole";
		//String str = s.concat(" Bole");
		System.out.println(s.concat(surname));
		
		System.out.println(s+surname);
		System.out.println(10+20);
		
		System.out.println(s.charAt(4));
		System.out.println(s.substring(3));

	}

}
