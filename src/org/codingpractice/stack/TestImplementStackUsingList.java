package org.codingpractice.stack;

public class TestImplementStackUsingList {
	
	private StackNode root;
	
	 static class StackNode{
		 int data;
		 StackNode next;
		 
		 public StackNode(int data) {
			this.data = data;
			this.next = null;
		}	 
	 }
	 
	 public boolean isEmpty() {

		 return (root == null);		 
	 }
	 
	 
	 public void push(int data) {
		 
		 //create a new Node
		 StackNode newNode = new StackNode(data);
		 
		 if(root == null) {
			 root = newNode;
		
		 }
		 else {
			 newNode.next = root;
			 root = newNode; 
		 }
		 	 
		 System.out.println(data + " pushed to stack"); 
	 }
	 
	 
	 public int pop() {
		 
		 int popped = Integer.MIN_VALUE;
		  
		 if(root == null) {
			 System.out.println("Stack is Empty"); 
		 }
		 else {
			 popped = root.data;
			 root = root.next;
		 }
		 
		 return popped;
	 }
	 
	  public int peek() {
		  int peek = Integer.MIN_VALUE;
		  if(root == null) {
				 System.out.println("Stack is Empty"); 
			 }
		  else {
			  peek = root.data;
		  }
		  
		  return peek;
	  }
	 
	  public static void main(String[] args) 
	    { 
	  
		  TestImplementStackUsingList sll = new TestImplementStackUsingList(); 
	  
	        sll.push(10); 
	        sll.push(20); 
	        sll.push(30); 
	  
	        System.out.println(sll.pop() + " popped from stack"); 
	  
	        System.out.println("Top element is " + sll.peek()); 
	    } 
}
