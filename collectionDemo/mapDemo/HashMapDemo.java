package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Thane", 100);
		map.put("Pune", 200);
		map.put("Shivaji Nagar", 150);
		map.put("Mumbai", 250);
		map.put("Nagpur", 100);
		map.put(null, null);
		map.put("Kharadi", 110);
		map.put("Kharadi", 210);	
		//Set<String> keys = map.keySet();
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " = " +map.get(key));
		}
	}

}
