package samplePrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIntegerSeperate {

	//W J C to seperate String and Integer in "Welcome123"
	public static void main(String[] args) {
		String inputString = "Welcome123";
		//SeperateFun1(inputString);
		SeperateFun2(inputString);

	}
	
	//using Matchers
	public static void SeperateFun1(String str) {
		Matcher matcher = Pattern.compile("\\D+").matcher(str);
		matcher.find();
		String output1 = matcher.group(0);
		
		System.out.println("Only Characters : " +output1);
		
		Matcher m1 = Pattern.compile("\\d+").matcher(str);
		m1.find();
		
		int output2 = Integer.parseInt(m1.group(0));
		System.out.println("Only Numbers : " +output2);
	}
	
	//using array steps
	public static void SeperateFun2(String str) {
		String []partStrings = str.split("(?<=\\D)(?=\\d)");
		System.out.println(partStrings[0]);
		System.out.println(partStrings[1]);
	}
	
	//using other way
	public static void SeperateFun3(String str) {
		String alphaString = "", numString="";
		for(int i=0; i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				alphaString += str.charAt(i);
			}
			else {
				numString += str.charAt(i);
			}
			
		}
		System.out.println(alphaString);
		System.out.println(numString);
	}

}
