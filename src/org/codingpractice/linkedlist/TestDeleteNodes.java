package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestDeleteNodes {
	
	private void deleteNode(int position,SingleNode head) {
	 
		// If linked list is empty 
		 if(head == null)
			 return;
		 
		 //store head node
		 SingleNode current = head;
		 
		 //if heads need to to be removed
		 if(position == 0) {
			 head =current.getNext(); //change head
			 return;
		 }
		 
		// Find previous node of the node to be deleted 
		 for(int i = 0; current != null && i < position -1;i++) 
			 current = current.getNext();
		 
		// If position is more than number of ndoes 
		 if(current == null || current.getNext() == null)
			 return;
		 
		 // Node temp->next is the node to be deleted 
	     // Store pointer to the next of node to be deleted 
		  SingleNode next = current.getNext().getNext();
		  current.setNext(next);
	  }
	
	
	 /* Drier program to test above functions. Ideally this function 
       should be in a separate user class.  It is kept here to keep 
       code compact */
	
	   public static void main(String args[]) {
		   
		   SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		    
		   singleLinkedListOperation.createSingleLinkedList(7);
		   singleLinkedListOperation.insertInLinkedList(1, 200);
		   singleLinkedListOperation.insertInLinkedList(3, 200);
		   singleLinkedListOperation.insertInLinkedList(2, 200);
		   singleLinkedListOperation.insertInLinkedList(8,200);
		   
		   System.out.println("\nCreated Linked list is: "); 
		   singleLinkedListOperation.printList(singleLinkedListOperation.getHead());
		   
		   TestDeleteNodes dNodes = new TestDeleteNodes();
		   dNodes.deleteNode(4, singleLinkedListOperation.getHead());
		   
		   System.out.println("\nLinked List after Deletion at position 4: "); 
		   singleLinkedListOperation.printList(singleLinkedListOperation.getHead());
		   
	   }
	
	
	
	

}
