package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestRearrangeLinkedList {

	/**
	 * Rearrange a linked list in such a way that all odd position nodes are together 
	 * and all even positions node are together,
	 */
	
	 
	
	private static SingleNode rearrangeEvenOdd(SingleNode head) {
		 
		//corner case
		 if(head == null) //empty linked list
			 return null;
		
		 //initialize first node of even and 
		 //odd lists
		 
		 SingleNode odd = head;
		 SingleNode even = head.getNext();
		 
		// Remember the first node of even list so  
		// that we can connect the even list at the  
		// end of odd list.  
		 
		 SingleNode evenFirst = even;
		 
		  while(true) {
			 // If there are no more nodes,   
		     // then connect first node of even   
		     // list to the last node of odd list  
			  
			  if(odd == null || even == null || (even.getNext()) == null){
				   odd.setNext(evenFirst);
				   break;
			  }
			  
			  // Connecting odd nodes 
			   odd.setNext(even.getNext());
			   odd = even.getNext();
			   
			   // If there are NO more even nodes   
		        // after current odd.  
			     if(odd.getNext() == null) {
			    	 even.setNext(null);
			    	 odd.setNext(evenFirst);
			    	 break;
			     }
			  
			  // Connecting even nodes  
			     even.setNext(odd.getNext());
			     even = odd.getNext();		  
		  }
		 
		  return head;  
		 	
	}
	
	// Driver code  
	    public static void main(String[] args)  
	    {  
		     SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		      singleLinkedListOperation.createSingleLinkedList(1);
		      singleLinkedListOperation.insertInLinkedList(2, 99);
		      singleLinkedListOperation.insertInLinkedList(3, 99);
		      singleLinkedListOperation.insertInLinkedList(4, 99);
		      
		      SingleNode head = singleLinkedListOperation.getHead();
		      System.out.println("Given Linked List");
		      singleLinkedListOperation.printList(head);
		       
		      head  = rearrangeEvenOdd(head);
		      System.out.println();
		      System.out.println("Modified Linked List");  
		      singleLinkedListOperation.printList(head);
		      
	      }
	
	
}
