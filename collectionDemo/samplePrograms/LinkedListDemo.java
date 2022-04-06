package samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> Arraylist = new ArrayList<>();
		Arraylist.add("Godfrey");
		Arraylist.add("Denis");
		Arraylist.add("Suzen");
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		
		list.addAll(Arraylist);
		
		list.addFirst("Negan");
		list.addLast("Rick");
		list.add(2, "Glenn");
		
		//System.out.println(list);
		Iterator<String> itr = list.iterator();
		System.out.println("Before removing");
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		list.remove(4);
		
		Iterator<String> itr1 = list.iterator();
		System.out.println("\n***********After removing***********");
		while(itr1.hasNext()) {
			String str = itr1.next();
			System.out.println(str);
		}
		System.out.println("\n");
		System.out.println(list.get(5));
		System.out.println(list.getFirst());
		
		System.out.println(list.size());
		
	}

}
