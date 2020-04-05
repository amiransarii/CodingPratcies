package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestCircularLinkedList {

	
	
	/*This function returns true if given linked 
	list is circular, else false. */
	
	 static boolean isCircular(SingleNode head) {
		 
		 
		 //an empty linked list is circular
		 if(head == null)
			 return true;
		 
		// Next of head 
		 SingleNode node = head.getNext();
		 
		 
		 // This loop would stop in both cases (1) If 
		 // Circular (2) Not circular 
		 
		 while(node != null && node != head) 
			 node = node.getNext();
		 
		  // If loop stopped because of circular 
		  // condition 
		 return (node == head);	 
			 		 
	 }
	 
	 
	  public static void main(String args[]) {
		  
		SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		singleLinkedListOperation.createSingleLinkedList(1);
		singleLinkedListOperation.insertInLinkedList(2, 100); //100 is a just dummy value
		singleLinkedListOperation.insertInLinkedList(3, 100); //to satisfy the condition
		singleLinkedListOperation.insertInLinkedList(4, 100);
		
		System.out.println(isCircular(singleLinkedListOperation.getHead())? "Yes\n" :  "No\n" );
		  
		// Making linked list circular 
		singleLinkedListOperation.getHead().setNext(singleLinkedListOperation.getHead());
		System.out.print(isCircular(singleLinkedListOperation.getHead())? "Yes\n" : 
                "No\n" ); 
		  
		  
		  
	  }
	 
	 
	 
	 
}
