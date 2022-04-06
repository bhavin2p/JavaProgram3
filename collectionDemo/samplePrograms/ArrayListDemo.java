package samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(100);
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		list.add(500);
		System.out.println(list);
		System.out.println(list.get(2));
		//list.add(null);
		
		System.out.println(list);
		
		list.add(1, 600);
		System.out.println(list);
		//System.out.println(list.contains(600));
		System.out.println("Using foreach");
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("Using for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using for Iterator");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int a = itr.next();
			System.out.println(a);
		}
		
		

	}

}
