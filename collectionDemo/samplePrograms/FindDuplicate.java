package samplePrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String names[] = { "Amazon", "Azure", "GCP", "Amazon", "GCP"};
		
		//Using Collections
		Set<String> data = new HashSet<>();
		for(String name : names) {
			if(data.add(name) == false) {
				System.out.println(name);
			}
		}
		
		//Using For loop
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[j]);
				}
			}
		}
		
		
		//Array of integer
		int []a = {1,3,4,5,6,7,3,2,1};
		Set<Integer> no = new HashSet<>();
		for(int n : a) {
			if(no.add(n) == false) {
				System.out.println(n);
			}
		}

	}

}
