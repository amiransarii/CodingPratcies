package org.codingpractice.stack;

public class TestImplementStackUsingArray {
	private static final int MAX = 1000;
	private int top;
	private int[] arr = new int[MAX];// Maximum size of Stack 
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	public TestImplementStackUsingArray() {
		// TODO Auto-generated constructor stub
		top  = -1;
	}
	
	boolean push(int x) {
		
		if(top >= (MAX -1)) {
			System.out.println("Stack Overflow"); 
            return false; 
		}
		else {
			arr[++top] = x;
			  System.out.println(x + " pushed into stack"); 
	            return true; 
		}
		
		
	}
	
	
	int pop() {
		
		if(top < 0) {
			System.out.println("Stack Underflow"); 
            return 0; 
		}
		else {
			int x = arr[top--];
			return x;
		}
		
	}
	
	
	int peek() {
		
		if(top < 0) {
			System.out.println("Stack Underflow"); 
            return 0; 
		}
		
		else {
			int x = arr[top];
			
			return x;
		}
	}
	
	// Driver code 
	
	    public static void main(String args[]) 
	    { 
	    	TestImplementStackUsingArray s = new TestImplementStackUsingArray(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.pop() + " Popped from stack"); 
	    } 
}
