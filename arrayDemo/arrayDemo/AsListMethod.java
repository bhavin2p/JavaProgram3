package arrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMethod {

	public static void main(String[] args) {
		//int intArr[] = {10, 50, 80, 40, 10};
		String arr[]= new String[] { "Java", "C", "C++", "Python" };
		
		
		List<String> arryList = Arrays.asList(arr);
		
		System.out.println(arryList.get(2));
		
		/*
		List<int[]> list = new ArrayList<>();
		list = Arrays.asList(intArr);
		*/
		

	}

}
