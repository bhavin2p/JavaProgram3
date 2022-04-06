package catchDemo;

import java.util.*;


public class Test {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(200);
		list.add(400);
		list.add("Bhavin");
		list.add('D');
		list.add(12.2);
		
		Set set = new HashSet();
		set.addAll(list);
		set.add("Monali");
		System.out.println(set.size());
		set.remove(200);
		System.out.println(set.size());
		System.out.println(set.hashCode());
		System.out.println(set);
		
		//int []arr = {20,30,10,450, "Bhavin"};
		
	}

}
