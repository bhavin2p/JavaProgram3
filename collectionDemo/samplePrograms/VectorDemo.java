package samplePrograms;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector<Integer> vlist = new Vector<>();
		vlist.add(20);
		vlist.add(300);
		vlist.add(300);
		vlist.add(100);
		vlist.addElement(500);
		
		Iterator<Integer> itr = vlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
