package samplePrograms;

public class StringImmtable {

	public static void main(String[] args) {

		String s = "Sachin";
		System.out.println(System.identityHashCode(s));
		s = s.concat(" Tendulkar");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		String s1 = "Sachin";
		System.out.println(System.identityHashCode(s1));

	}

}
