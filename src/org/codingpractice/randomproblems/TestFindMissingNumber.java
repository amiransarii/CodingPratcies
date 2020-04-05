package org.codingpractice.randomproblems;

public class TestFindMissingNumber {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,4,5,6};
		int missinNumber = getSumUsingMath(arr, 5);
		System.out.println("Missing Number Using Math "+missinNumber);
	}
	
	
	
	
	
	
	/**
	 * first method to find the missing number
	 * using sum of the of n elements
	 *  n *(n +1)/2
	 */
	private static int getSumUsingMath(int[] arr, int n) {
		 
		int sum = (n +1) *(n +2)/2; //add one
		int missingNumber = Integer.MIN_VALUE;
		
		for(int i = 0; i < n;i++) {		
			sum -= arr[i];
			
		}
		return sum;
		 
		
	}

}
