package samplePrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("Suzen");
		set.add("Daniel");
		set.add("Monali");
		set.add("Monali");
		
		System.out.println(set);

		set.remove("Monali");
		System.out.println(set);
		
	}

}
