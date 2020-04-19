package org.codingpractice.randomproblems;

public class TestFindFactorial {
	
	public static void main(String args[]) {
		
		int fact = usingIterative(6);
		System.out.println(fact);
		System.out.println(usingRecusive(5));
	}
	
	
	
	private static int usingIterative(int number) {
		
		int result = 1;
		
		for(int i = 1 ; i <= number; i ++) {
			result = result*i;
		
		}
		
		return result;
	}
	
	
	
	 private static int usingRecusive(int number) {
		 
		 //base case
		 if(number == 0 || number == 1) {
			 return 1;
		 }
		 
		 //else {
			 return number*usingRecusive(number - 1);
		 //}
		 
		 
	 }

}
