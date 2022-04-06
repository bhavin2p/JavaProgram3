package arrayDemo;

import java.util.Arrays;

public class SortArray2 {

	public static void main(String[] args) {
		
		int intArr[] = {10,20,1,4,3,2,5,10,6,8,01,300};
		
		for(int i=0; i<intArr.length;i++) {
			for(int j= i+1; j<intArr.length; j++)
			{
				if(intArr[i]>intArr[j]) {
					int temp;
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		for(int a : intArr) {
			System.out.println(a);
		}
		
		/*
		int a = 10;
		int b = 20; 
		int temp; 
		
		System.out.println("Value for A before swap : " +a);
		System.out.println("Value for B before swap : " +b);
		
		temp = a; //10
		a = b; //a= 20
		b= temp; //b=10
		
		System.out.println("Value for A after swap : " +a);
		System.out.println("Value for B after swap : " +b);
		*/
		
		
		/*Arrays.sort(intArr);
		
		for(int i=0; i<intArr.length;i++) {
			int a = intArr[i];
			System.out.println(a);
		}
		
		for(int a : intArr) {
			System.out.println(a);
		}*/
		

	}

}
