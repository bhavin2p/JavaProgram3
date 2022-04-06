package samplePrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Four")) {
				System.out.println(str);
			}
		}

	}

}
