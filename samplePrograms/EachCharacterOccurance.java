import java.util.HashMap;
import java.util.Map;

public class EachCharacterOccurance {

	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<>();
		char strArray[] = name.toCharArray();
		for (char c : strArray) {
			if (charMap.containsKey(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c=='o'|| c=='u' || c == 'A' || c == 'E' || c == 'I' || c=='O'|| c=='U') {
					charMap.put(c, charMap.get(c) + 1);
				}
			} else if (c == 'a' || c == 'e' || c == 'i' || c=='o'|| c=='u' || c == 'A' || c == 'E' || c == 'I' || c=='O'|| c=='U')  {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
	}

	public static void main(String[] args) {
		String str = "BhaveeAnEEAuU";
		getCharCount(str.toLowerCase());
	}

}
