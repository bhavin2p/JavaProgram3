package samplePrograms;

public class StringSample {

	public static void main(String[] args) {
		String s = "ABCD";
		s.concat("EFGH");
		System.out.println(s); //o\p=ABCD
		System.out.println(s.concat("EFGH"));//op = ABCDEFGH
		
		String x = "Strings Are ";
		String s1 = x;
		x += " Immutable Objects!";
		System.out.println("x = " + x); //o\p=x = Strings Are  Immutable Objects!
		System.out.println("s = " + s); //o\p = s = ABCD
		
		final String x1 = "Strings Are ";
		//x1 += " Immutable Objects!"; //will get an error we can not change value of x1 final

		System.out.println(x1);




	}

}
