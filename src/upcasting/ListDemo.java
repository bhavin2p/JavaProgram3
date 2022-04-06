package upcasting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static List<Integer> intList;
	public static List<Integer> ArrayListDemo() {
		intList = new ArrayList<>();
		intList.add(100);
		intList.add(200);
		intList.add(500);
		return intList;
		
	}
	public static List<Integer> LinkedListDemo() {
		intList = new LinkedList<>();
		intList.add(10);
		intList.add(20);
		intList.add(50);
		return intList;
	}
	public static void main(String[] args) {
		System.out.println(ArrayListDemo());
		System.out.println(LinkedListDemo());
	}
}
