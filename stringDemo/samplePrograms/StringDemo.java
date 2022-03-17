package samplePrograms;

public class StringDemo {

	public static void main(String[] args) {
		//String //Array
		//immutable variable
		String str = "Monali";
		String str1 = "Monali"; //str1 = Monali
		System.out.println(str); 
		System.out.println(str1);
		
		
		//String str2 = "Java";
		str = "Java1.8";
		System.out.println(str);
		String str3 = new String("Monali");
		String str4 = new String("Monali");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str1);
	}

}
