package samplePrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(32);
		set.add(10);
		set.add(5);
		set.add(1);
		set.add(1);
		set.add(4);
		
		//System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> itr = set.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
