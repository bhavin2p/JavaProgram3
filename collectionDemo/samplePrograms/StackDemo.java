package samplePrograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		//System.out.println("Is stack empty = " +stack.empty());
		stack.push("Moneli");
		//System.out.println("Is stack empty = " +stack.empty());
		stack.add("Moneli");
		stack.push("Lerato");
		stack.push("Dineo");
		stack.push("zelda");
		
		System.out.println(stack);
		//stack.remove(2);
		System.out.println(stack.pop()); //Dineo
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println("The index of Lerato : " +stack.search("Lerato"));

	}

}
