package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.SingleLinkedListOperation;

public class TestGetNthNode {

	
	
	 /* Takes index as argument and return data at index*/
	 
	//using iterative
	public static int GetNth(int index, SingleNode head) {
	      SingleNode current = head;
	      
	      int count = 0;/* index of Node we are 
          currently looking at */
	      
	      while(current != null) {
	    	  
	    	  if(count == index) {
	    		  return current.getValue();
	    	  }
	    	  count++;
	          current = current.getNext();
	      }
	      
	      /* if we get to this line, the caller was asking 
	        for a non-existent element so we assert fail */
	        assert(false); 
	        return 0; 
	 }
	
	
	//using recursive 
	 public static int GetNthRecursive(SingleNode head, int n) {
		 
		 int count = 1;
		 
		 //if count equals too n returns node.data
		  if(count == n) {
			  return head.getValue();
		  }
		  //recursively decrease n and increase  
		    // head to next pointer  
		  return GetNthRecursive(head.getNext(), n - 1);	 
	 }
	 
	 
	  public static void main(String args[]) {
		  
		  SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
		  singleLinkedListOperation.createSingleLinkedList(1);
		  singleLinkedListOperation.insertInLinkedList(4, 200);
		  singleLinkedListOperation.insertInLinkedList(1, 200);
		  singleLinkedListOperation.insertInLinkedList(15, 200);
		  singleLinkedListOperation.insertInLinkedList(1, 200);
		  
		  
		  SingleNode head = singleLinkedListOperation.getHead();
		
	     
		  System.out.println("Using Recursive ");
		 System.out.printf("Element at index 3 is %d",  GetNth (3,head));  
		  
		 System.out.println();
		 System.out.printf("Element at index 3 is %d",  GetNthRecursive (head,3));  
		  
		  
		  
	  }
	
	
	
	
	
}
