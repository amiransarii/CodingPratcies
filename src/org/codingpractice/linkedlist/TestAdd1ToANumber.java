package org.codingpractice.linkedlist;

import org.codingpractice.entity.SingleNode;

public class TestAdd1ToANumber {
	/**
	 * Below are the steps :
	 * Reverse given linked list. For example, 1-> 9-> 9 -> 9 is converted to 9-> 9 -> 9 ->1.
       Start traversing linked list from leftmost node and add 1 to it. If there is a carry, 
       move to the next node. Keep moving to the next node while there is a carry.
       Reverse modified linked list and return head.
	 */
     private SingleNode head;
     private SingleNode tail;
     private int size = 0;
     
     
     //create linked list
      private SingleNode createSingleLinkedList(int nodeValue) {
    	  head = new SingleNode();
    	  SingleNode newNode = new SingleNode();
    	  newNode.setValue(nodeValue);
    	  newNode.setNext(null);
    	  head = newNode;
    	  tail = newNode;
    	  size++;
    	  return head;
      }
     
      //insert node in linked list
       private void insertNodeAtHead(int nodeValue) {
    	   
    	   SingleNode newNode = new SingleNode();
    	   newNode.setValue(nodeValue);
    	   
    	   if(!isLinkedListExist()) {
    		   createSingleLinkedList(nodeValue);
    		   System.out.println("LinkedList Does not exist create it");
    	   }
    	   
    	   else { //make a new node as header
               
    		   /**
    		    * insert node at head
    		    newNode.setNext(head);
               head = newNode; **/
    		   
    		   //add new node at the last
    		    tail.setNext(newNode);
    		    tail = newNode;
    		   
               		       		     		   
    	   }
    	   size++;
       }
      
         
      //check if linked list exist
       public boolean isLinkedListExist() {  
    	   return head != null;  	   
       }
       
       //traverse the list
        private void traverse(SingleNode traverseNode) {
        	SingleNode current = traverseNode;
        	
        	for(int i = 0; i< size ; i++) {
        		System.out.print(current.getValue() +" ");
        		 if(i != size -1) {
        			 System.out.print("-->");
        		 }
        		 current = current.getNext();
        	}  
        	
        }
     
      
        //reverse the linked list
        private SingleNode reverse(SingleNode reverseNode) {
          SingleNode prev = null;
          SingleNode current = reverseNode;
          SingleNode next = null;
          
          while(current != null) {
        	  
        	  next = current.getNext();
        	  current.setNext(prev);
        	  prev = current;
        	  current = next;
          }
          return prev;
   	
        }
     
     
        /* Adds one to a linked lists and return the head  
        node of resultant list */
        
        private SingleNode addOneUtil(SingleNode reveseHead ) {
        	
        	
        	//res is head node of the result list
        	SingleNode res = reveseHead;
			SingleNode temp = null;
			SingleNode prev = null;
			int carry = 1;
			int sum = 0;
					
			while(reveseHead != null) {//while both lists exist  
				
		     // Calculate value of next digit in resultant list.  
		     // The next digit is sum of following things  
		     // (i) Carry  
		    // (ii) Next digit of head list (if there is a  
		     // next digit)  	
			
				sum = carry + reveseHead .getValue();
				
			 //update carry for next calculation
			 carry = (sum >= 10) ? 1: 0;
			 
			// update sum if it is greater than 10  
			 sum = sum % 10;
			 
			 // Create a new node with sum as data  
			 reveseHead.setValue(sum);
			 
			 // Move head and second pointers to next nodes  
			 temp = reveseHead;
			 reveseHead = reveseHead.getNext();						
			}
			
			// if some carry is still there, add a new node to  
			//result list
			if(carry >0) {
				SingleNode carrayNode = new SingleNode();
				carrayNode.setValue(carry);
				temp.setNext(carrayNode);
				size++;
				
			}
			      	
        	return res;    	
        }
        
     // This function mainly uses addOneUtil().  
        public SingleNode addOne(SingleNode node ) {
        	 // Reverse linked list  
            head = reverse(head);  
          
            // Add one from left to right of reversed  
            // list  
            head = addOneUtil(head);  
          
            // Reverse the modified list  
            return reverse(head);  
        	
        }
        
        
        
        
         
        public static void main(String args[]) {
        	
        	 TestAdd1ToANumber addNode = new TestAdd1ToANumber();
        	 addNode.createSingleLinkedList(1); // create linked list
        	 addNode.insertNodeAtHead(9);//insert 9
        	 addNode.insertNodeAtHead(9);//insert 9
        	 addNode.insertNodeAtHead(9); //insert 9 	
        	 addNode.traverse(addNode.head);
        	 
        	/* System.out.println();
        	 System.out.println("Reverse Linked List");
        	 SingleNode reverseNode = addNode.reverse(addNode.head);
        	 addNode.traverse(reverseNode);*/
        	 
        	 System.out.println();
        	 System.out.println("After Adding one in List");
        	  
        	 
        	 SingleNode result = addNode.addOne(addNode.head);
        	 addNode.traverse(result);
        	 
        	
        	 
        	 
        	 
        	 
        	 
        	
        }
        
        
}
