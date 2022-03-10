package samplePrograms;

public class IntegerArr {

	public static void main(String[] args) {
		int a = 1234;
		
		String temp = Integer.toString(a);
		
		int len = temp.length();
		for(int i=0; i<len; i++) {
			System.out.println(temp.charAt(i));
		}

	}

}
