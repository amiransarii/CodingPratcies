package org.codingpractice.divideconquer;

public class TestFibonacciSeries {
	
	public static void main(String args[]) {
		
		
		int fib = getFibonacciNumber(7);
		System.out.println(fib);
	}
	
	
	
	
	
	
	private static int getFibonacciNumber(int n) {
		
	      //base case 
		 
		if(n < 1) {
			return -1;
		}
		
		  if(n <= 2) {
			  return n - 1;
		  }
		  
		  else {
			  return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
		  }
		
		
	}

}
