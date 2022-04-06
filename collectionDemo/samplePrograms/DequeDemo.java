package samplePrograms;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
			
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(100);
		
		deque.add(200);
		System.out.println(deque);
		deque.addFirst(300);
		System.out.println(deque);
		deque.addLast(600);
		System.out.println(deque);
		
		deque.push(700);
		System.out.println(deque);

		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		System.out.println(deque);

	}

}
