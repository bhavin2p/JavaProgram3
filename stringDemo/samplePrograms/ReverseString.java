package samplePrograms;

public class ReverseString {

	public static void main(String[] args) {
		String nameString = "ABCDEFG";
		String revString = "";
		for(int i=nameString.length()-1; i>=0;i--) {
			revString = revString + nameString.charAt(i);
		}
		System.out.println(revString);

	}

}
