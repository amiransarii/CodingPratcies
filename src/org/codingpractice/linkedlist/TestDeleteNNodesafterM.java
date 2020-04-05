package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestDeleteNNodesafterM {

	
	/**
	 * print the linked list
	 */
	private  static void printList(SingleNode head) {
		
		SingleNode current = head;
		
		while(current != null) {
			System.out.print(current.getValue() +" ->");
		     current = current.getNext();
		}		
	}
	
	// Function to skip M nodes and then 
	// delete N nodes of the linked list.  
	
	private static void skipMdeleteN( SingleNode head, int M, int N)  {
		
		SingleNode current = head;
		SingleNode t;
		int count;
		
		
		  // The main loop that traverses 
	    // through the whole list  
		
		while(current != null) {
			
			// Skip M nodes  
			for(count = 1; count < M && current != null; count++) {
				current = current.getNext();
			}
			
			 // If we reached end of list, then return 
			  if(current == null)
				  return;
			  
			 // Start from next node and delete N nodes  
			  t = current.getNext();
			  
			  for(count = 1;count <= N && t != null; count++) {
				   SingleNode temp = t;
				   t = t.getNext();
			  }
			  
			// Link the previous list with remaining nodes  
		        current.setNext(t);  
		  
		        // Set current pointer for next iteration  
		        current = t;  
		}
		
	}
	
	// Driver code  
	public static void main(String args[]) 
	{  
	    /* Create following linked list  
	    1.2.3.4.5.6.7.8.9.10 */
		//SingleNode head = new SingleNode();
		SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		
	    //Node head = null;  
	    int M=2, N=3;  
	    
	    singleLinkedListOperation.createSingleLinkedList(1);
	    singleLinkedListOperation.insertInLinkedList(2, 20);
	    singleLinkedListOperation.insertInLinkedList(3, 20);
	    singleLinkedListOperation.insertInLinkedList(4, 20);
	    singleLinkedListOperation.insertInLinkedList(5, 20);
	    singleLinkedListOperation.insertInLinkedList(6, 20);
	    singleLinkedListOperation.insertInLinkedList(7, 20);
	    singleLinkedListOperation.insertInLinkedList(8, 20);
	    singleLinkedListOperation.insertInLinkedList(9, 20);
	    singleLinkedListOperation.insertInLinkedList(10, 20);
	    
	   
	   SingleNode head = singleLinkedListOperation.getHead();
	  
	    System.out.printf("M = %d, N = %d \nGiven" +  
	                        "Linked list is :\n", M, N);  
	    printList(head);  
	  
	    skipMdeleteN(head, M, N);  
	  
	    System.out.printf("\nLinked list after deletion is :\n");  
	    printList(head);  
	}  
	
	
}
