package org.codingpractice.linkedlist;

import org.codingpractice.methods.StackByLinkedList;

public class TestStackByLinkedListMain {
	
	public static void main(String args[]) {
		
		StackByLinkedList stack = new StackByLinkedList();
		System.out.println("Pushing 10 values into stack");
		
		for(int i = 1 ; i <= 10; i++) {
			stack.push(i*10);
		}
		
		 System.out.println("Peeking Value");
		 System.out.println(stack.peek());
		 System.out.println();
		 
		 System.out.println("Popping 11 values from stack");
		 for(int i = 1 ;  i<=11; i++) {
			 System.out.println(stack.pop());
		 }
		 System.out.println();
		
		
		
	}

}
