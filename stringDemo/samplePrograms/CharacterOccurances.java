package samplePrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurances {

	public static void main(String[] args) {
		String string = "aaabbbcccddes";
		
		char []charA = string.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : charA) {
			
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap);
		
		

	}

}
