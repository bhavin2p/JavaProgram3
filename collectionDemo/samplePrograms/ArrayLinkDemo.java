package samplePrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLinkDemo {
	
	public static List<Integer> listA;
	//public static ArrayList<Integer> listA;
	//public static LinkedList<Integer> listA;
	
	public static void ArrayListDemo() {
		listA = new ArrayList<>();
		listA.add(100);
		listA.add(200);	
		System.out.println(listA);
	}
	public static void LinkedListDemo() {
		listA = new LinkedList<>();
		listA.add(230);
		listA.add(430);
		System.out.println(listA);
	}
	
	public static void main(String[] args) {
		ArrayListDemo();
		LinkedListDemo();

	}

}
