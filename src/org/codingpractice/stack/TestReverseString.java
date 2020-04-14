package org.codingpractice.stack;

import java.util.Stack;

public class TestReverseString {
	
	private static String reverString(String str) {
		
		String result ="";
		Stack<Character> stack = new Stack<Character>();
		
		//convert string to char Array
		char[] charArr = str.toCharArray();
		
		for(char ch : charArr) {		
			//push the element in stack
			stack.push(ch);
		}
		
		//now pop the character from stack
		
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		
	 return result;	
	}
	
	 public static void main(String args[]) {
		 
		 String str = "GeeksQuiz";
		 
		 String rev = reverString(str);
		 
		 System.out.println(rev);
		 
		 
		 
	 }
	

}
