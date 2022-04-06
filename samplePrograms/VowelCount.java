import java.util.HashMap;

public class VowelCount {

	public static void vowel_calc(String s)
    {
		HashMap<Character, Integer> chMap = new HashMap<>();
		char []ch = s.toCharArray();
		
		for(char c : ch) {
			/*if(chMap.containsKey(c)) {	
				if(c == 'a' || c == 'e' || c == 'i' || c=='o'|| c=='u' || c == 'A' || c == 'E' || c == 'I' || c=='O'|| c=='U') {
					chMap.put(c, chMap.get(c)+1);
				}
			}*/
			/*
			if(c == 'a' || c == 'A') {
				chMap.put(c, chMap.get(c));
			}
			else if(c == 'e' || c == 'E') {
				
			} else if(c == 'i' || c == 'I') {
				
			} else if(c=='o'|| c=='O') {
				
			} else if(c=='u' || c=='U') {
				
			}
			*/
			if(chMap.containsKey(c)) {
				if(c == 'a' || c == 'A')
					chMap.put(c, chMap.get(c)+1);
			}
			else if(c == 'a' || c == 'A'){
				chMap.put(c, 1);
			}
			
			
			
		}
		System.out.println(chMap);    
    }
	public static void main(String[] args) {
		String string = "Bhaveen";
		vowel_calc(string);
	}

}
