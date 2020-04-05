package org.codingpractice.linkedlist;

import org.codingpractice.entity.DoubleNode;
import org.codingpractice.entity.SingleNode;
import org.codingpractice.methods.DoubleLinkedList;

public class TestFlatteningLinkedList {
	
	/**
	 * (i) Pointer to next node in the main list (we call it ‘right’ pointer in below code)
       (ii) Pointer to a linked list where this node is head (we call it ‘down’ pointer in below code).
        All linked lists are sorted. See the following example
	 */
	
	// An utility function to merge two sorted linked lists
	  
	DoubleNode merge(DoubleNode a, DoubleNode b) {
		 
		  // if first linked list is empty then second 
	       // is the answer 
		   
		   if(a == null)
			   return b;
		
		 // if second linked list is empty then first 
	     // is the result 
		  
		   if(b == null)
			   return a;
		   
		   // compare the data members of the two linked lists 
	       // and put the larger one in the result    
		   DoubleNode result;
		   
		   if(a.getValue() < b.getValue()) {
			   result = a;
			   result.setPrev(merge(a.getPrev(), b)); //previous node as down node
		   }
		   
		   else {
			    result = b;
			    result.setPrev(merge(a, b.getPrev()));
		   }
		      
		   return result; 
		   
	  }
	
	
	  DoubleNode flatten(DoubleNode root) {
		
		   //base case
		  if(root == null || root.getNext() == null) //next node as a right node
		  return root;
		  
		// recur for list on right 
		  root.setNext(flatten(root.getNext()));
		  
		  
		// now merge 
		  root = merge(root, root.getNext());
		  
		  // return the root 
	        // it will be in turn merged with its left 
	        return root; 
		  
	  }
	
	
	
	
	
	
	

}
