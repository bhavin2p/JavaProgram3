package samplePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f = 0, s = 1, sum;
		int num=10;
		int i;
		for(i=0; i<num;i++) {
			
			System.out.print(f + " ");
			sum = f+s; //sum = 1+1 = 2
			f=s;		 //f=1
			s=sum; //s = 2
			if(f==8) {
				break;
			}
			
		}
		System.out.println();

	}

}
