package org.codingpractice.stack;

public class TestReverseString3 {
	
	//a utility function to swap two characters
	
	static void swap(char arr[], int index1 , int index2) {
		char temp = arr[index1];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}

	
	 static void reverse(char str[]) { 
	        // get size of string  
	        int n = str.length, i; 
	  
	        for (i = 0; i < n / 2; i++) { 
	            swap(str, i, n - i - 1); 
	        } 
	    } 
	 
	// Driver program to test above functions  
	    public static void main(String[] args) { 
	        char str[] = "abc".toCharArray(); 
	  
	        reverse(str); 
	        System.out.printf("Reversed string is " + String.valueOf(str)); 
	    } 
}
