package samplePrograms;

public class Recursion {
	
	public static int fact(int num) {
		int factorial = 1;
		for(int i = 1; i<=num; i++)
		{		
			factorial = factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		//int factorialNum = fact(5);
		System.out.println(fact(5));

	}

}
