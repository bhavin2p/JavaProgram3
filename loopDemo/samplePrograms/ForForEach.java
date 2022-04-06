package samplePrograms;

public class ForForEach {

	public static void main(String[] args) {
		int num[] = {10, 20, 30, 40};
		int len = num.length;
		
		for(int i = 0; i<len; i++) {
			System.out.println(num[i]);
		}
		/*
		for(int n : num) {
			System.out.println(n);
		}*/

	}

}
