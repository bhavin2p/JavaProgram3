package mapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, Book> mBook = new TreeMap<>();
		
		Book b1 = new Book(101, "Java Program", "Monali Bole", "Zensar", 8);
		Book b2 = new Book(102, "Java Program2", "Bhavin", "Momentum", 4);
		Book b3 = new Book(103, "C Program", "Lerato", "MomentumSA", 7);
		
		mBook.put(1, b1);
		mBook.put(2, b2);
		mBook.put(3, b3);
		
		System.out.println(mBook);
		for(Map.Entry<Integer, Book> entry : mBook.entrySet() ) {
			int k = entry.getKey();
			Book b = entry.getValue();
			System.out.println("Key = " +k );
			//System.out.println("Values = " +b);
			System.out.println("Id = " +b.id );
			System.out.println("Quantity = " +b.quantity);
			System.out.println("Name = " +b.name);
			System.out.println("Publisher = " +b.publisher);
			System.out.println("Author = " +b.author + "\n");
			
		}
		
		/*
		for(Map.Entry<Integer, Book> entry:mBook.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    } */

	}

}
