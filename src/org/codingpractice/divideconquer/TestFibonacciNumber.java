package org.codingpractice.divideconquer;

/**
 * 
 * @author amir.ansari
 * find nth fibonacci number using divide 
 * and conquer 
 */
public class TestFibonacciNumber {
	public static void main(String[] args) {
		System.out.println("5th Fibonacci is ---> " + getFibNth(5));
		System.out.println("6th Fibonacci is ---> " + getFibNth(6));
	}// end of method
	
	
	
	
	private static int getFibNth(int number) {
	   
		if(number <0) 
			throw new IllegalArgumentException("number can not be negative ");
		
		//base case 
		 if(number == 0)
		  return 0;
		 
		 else if(number == 1 || number == 2) {
			 return number -1;
		 }
		 else {
			 return getFibNth( number-1) + getFibNth(number -2);
		 }
		
	}
}
