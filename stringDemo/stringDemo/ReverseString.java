package stringDemo;

public class ReverseString {
	
	public static void main(String[] args) {
		//01234567
		//Momentum
		String s1 = "Momentum";
		//StringBuilder // StringBuffer
		
		String rev= "";
		int len = s1.length(); //8
		for(int i=len-1; i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		
		
		
		
	}

}
