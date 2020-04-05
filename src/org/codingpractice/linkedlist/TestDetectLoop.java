package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestDetectLoop {
	
	private static boolean detectLoop(SingleNode head) {
	
		SingleNode slow_p = head;
		SingleNode fast_p = head;
		 
		SingleNode current = head;
		
		
		while(slow_p != null && fast_p != null && fast_p.getNext() != null) {
			slow_p = slow_p.getNext();
			fast_p = fast_p.getNext().getNext();
			
			if(slow_p == fast_p) {
				System.out.println("Found Loop");
				return true;
			}		
			else {
				System.out.println("Found not Loop");
			}
		}
		return false;
	}
	
	 public static void main(String args[]) {
		 SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		 singleLinkedListOperation.createSingleLinkedList(20);
		 singleLinkedListOperation.insertInLinkedList(4, 200);
		 singleLinkedListOperation.insertInLinkedList(15, 200);
		 singleLinkedListOperation.insertInLinkedList(10, 200);
		 
		 /*Create loop for testing */
		 SingleNode head = singleLinkedListOperation.getHead();
		 detectLoop(head);		 
	 }
	 
	

}
