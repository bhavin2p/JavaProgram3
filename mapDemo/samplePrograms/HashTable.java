package samplePrograms;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTable {

	public static void main(String[] args) {
		
		//HashTable will not allow null value and null key
		Hashtable<Integer, String> h1 = new Hashtable<>();
		
		h1.put(1, "Hello");
		h1.put(2, "Hello1");
		h1.put(3, "Hello2");
		h1.put(4, "Hello3");
		
		Iterator<Integer> itr = h1.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(h1.get(key));
		}
		
		
		
		//System.out.println(h1);

	}

}
