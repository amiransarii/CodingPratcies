package org.codingpractice.stack;

public class TestReverseString2 {

	class Stack{
		int size ;
		int top;
		char[] arr;
		
		//function to check if stack is empty
		boolean isEmpty() {
			
			return top < 0;
		}
		
		Stack(int n){
			top = -1;
			size = n;
			arr = new char[size];
		}
		
		//function to push element in Stack 
		boolean push(char x) {
			
			if(top >= size) {
				System.out.println("Stack Overflow"); 
		        return false; 
			}
			else {
				arr[++top] = x;
				return true;
			}
		}
		 //function to pop element from stack 
		char pop() {
			
			if(top < 0) {
				 System.out.println("Stack Underflow"); 
			        return 0; 
			}
			else {
				char x = arr[top --];
				return x;
			}	
		}
	}
	
	//function to reverse the string
	void reverse(StringBuffer str) {
		
		// Create a stack of capacity  
        // equal to length of string 
		
		int n = str.length();
		Stack obj = new Stack(n);
		
		//push all character of string
		//to stack
		
		int i;
		
		for(i = 0 ;  i < n ; i++)
			obj.push(str.charAt(i));
		
		//pop all chaacters of string
		//and put them back
		
		for(i = 0 ;  i < n ; i++)
		{
			char ch = obj.pop();
			
			str.setCharAt(i, ch);
		}
	}
	
	//driver function 
    public static void main(String args[]) 
    { 
        //create a new string 
        StringBuffer s= new StringBuffer("GeeksQuiz"); 
          
        //call reverse method 
        TestReverseString2 tn = new TestReverseString2();
        tn.reverse(s); 
          
        //print the reversed string 
        System.out.println("Reversed string is " + s); 
    } 
	
	
}
