package samplePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f = 0, s = 1, sum;
		int num=10;
		for(int i=0; i<num;i++) {
			System.out.print(f + " ");
			sum = f+s;
			f=s;		
			s=sum;
		}
		System.out.println();

	}

}
