package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Character, String> hMap = new HashMap<>();
		hMap.put('M', "Moneli");
		hMap.put('D', "Dineo");
		hMap.put('S', "Suzen");
		
		Map<Character, String> linkMap = new LinkedHashMap<>();
		linkMap.put('A', "Apple");
		linkMap.putAll(hMap);	
		System.out.println("LinkedHashMap Values = " +linkMap);
		if(linkMap.containsKey('S')) {
			System.out.println("Value for Key N is + " +linkMap.get('S'));
		}
		else
		{
			System.out.println("Key N is not present in LinkedHashMap");
		}
		for(Character c : linkMap.keySet()) {
			System.out.println(c + " = " +linkMap.get(c));	
		}
		boolean status =  linkMap.isEmpty();
		System.out.println(status);
	}
}
