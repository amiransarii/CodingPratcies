package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;

public class TestBinaryToDecimal {
	/**Decimal Equivalent of Binary 
	 * Initialize result as 0. Traverse the linked list and for each node,
	 *  multiply the result by 2 and add node’s data to it.
	 */
 
	  
	// Returns decimal value of binary linked list / 
	 private static int decimalValue(SingleNode head) {
		 
		 //initialized the result
		  int res = 0;
		  
		  //traverse linked list
		   while(head != null) {
			// Multiply result by 2 and add  
		     // head's data  
			 res = (res<<1) +(head.getbooleanValue()?1:0);
			 //move next
			 head = head.getNext();
		   }
		   return  res;	 
	 }
	 
	// Utility function to create a new node.  
	  static SingleNode insertNode(int data) {
		  SingleNode newNode = new SingleNode();
		  newNode.setBooleanValue(data == 1?true:false);
		  newNode.setNext(null);
		  return newNode;
	  }
	 private void aaa() {
		 
	 }
	 
	// Driver code/ 
	  public static void main(String args[]) 
	  {  
	      // Start with the empty list / 
		    		  
	       SingleNode head = insertNode(1); 
           head.setNext(insertNode(0));
           head.getNext().setNext(insertNode(1));
           head.getNext().getNext().setNext(insertNode(1));
           
	      System.out.print( "Decimal value is "+decimalValue(head));  
	      
	      
	  } 
	 
	 
}
