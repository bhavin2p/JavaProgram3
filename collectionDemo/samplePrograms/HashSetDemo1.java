package samplePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		/*
		List<String> Arraylist = new ArrayList<>();
		Arraylist.add("Godfrey");
		Arraylist.add("Denis");
		Arraylist.add("Suzen");
		Arraylist.add("Pune"); */
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Pune");
		hashSet.add("Mumbai");
		
		hashSet.add("Mumbai");
		hashSet.add("Pune");
		hashSet.add("Momentum");
		//hashSet.addAll(Arraylist);
		
		System.out.println(hashSet.hashCode());
		
		//hashSet.removeIf(n -> (n.charAt(1) == 'u'));
		//System.out.println(hashSet);
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			/*if(str.charAt(0)=='S') {
				hashSet.remove(str);
			}*/
			System.out.println(str);
			
		}
		

	}

}
