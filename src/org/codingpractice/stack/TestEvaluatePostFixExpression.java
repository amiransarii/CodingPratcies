package org.codingpractice.stack;

import java.util.Stack;

public class TestEvaluatePostFixExpression {
	
	static int evalautePostFix(String exp) {
		
		//create a stack
		Stack<Integer> stack = new Stack<Integer>();
		
		//scan all characters one by one
		for(int i = 0 ; i < exp.length() ;i++) {
			char c = exp.charAt(i);
			
			 // If the scanned character is an operand (number here), 
            // push it to the stack. 
			if(Character.isDigit(c))
				stack.push(c - '0');
			
			   //  If the scanned character is an operator, pop two 
            // elements from stack apply the operator 
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c) {
				 
				case '+':
					stack.push(val1 + val2);
					break;
					
				case '-':
					stack.push(val1 - val2);
					break;
					
				case '*':
					stack.push(val1 * val2);
					break;
				
				}
				
				
			}
			
		}
		
		 return stack.pop();     
		
	}
	// Driver program to test above functions 
    public static void main(String[] args)  
    { 
        String exp="231*+9-"; 
        System.out.println("postfix evaluation: "+evalautePostFix(exp)); 
    } 
}
