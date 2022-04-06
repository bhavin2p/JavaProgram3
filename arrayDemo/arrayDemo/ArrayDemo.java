package arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int[] a1 = {1,5,2,3};
		int []a2 = {2,4};
		String str[] = {"ABC", "String", "Java", "Python"};
		
		int a3[] = new int[10];

		for(int i=0; i<10; i++) {
			a3[i] = i*10;
			System.out.println(a3[i]);
		}
		int length = a3.length; // array length
		String str1 = "JavaFunction";
		int length1 = str1.length(); //string length
		
		/*
		char c[] = new char[10];
		//c[0]='a';
		for(int i=0; i<10; i++) {
			int i1 = 61+i;
			c[i] = (char) i1;
			System.out.println(c[i]);
		}*/
		
		System.out.println(a1.length);
		
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		

	}

}
