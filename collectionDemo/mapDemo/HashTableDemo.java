package mapDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("Moneli", "Lindiwe");
		map.put("Lindiwe", "Deon");
		map.put("Suzen", "Godfrey");
		map.put("Suzen", "Lindiwe");
		System.out.println(map);
		
		for(String str : map.keySet()) {
			System.out.println(str + " = " +map.get(str));
		}
		
		

	}

}
