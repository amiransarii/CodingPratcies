package org.codingpractice.randomproblems;

public class TestArmstrongNumber {
	
	
	public static void main(String args[]) {
		
		int number = 371;
		
		boolean result = isArmStrong(number);
		
		System.out.println(result);
	}
	
	
	
	
	
	private static boolean isArmStrong(int number) {
	
		int orig = number;
		 
		if(number < 0)
			number = number*-1;
		 
		int sum = 0;
		
		while(number != 0 ) {
			
			int rem = number % 10; //modulus
			sum = sum + rem*rem*rem;
			number/=10;
		}
		
		System.out.println("Sum "+sum);
		if(sum == orig)
			return true;
		
		return false;
		
		
	}

}
