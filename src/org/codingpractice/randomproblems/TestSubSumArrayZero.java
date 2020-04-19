package org.codingpractice.randomproblems;

import java.util.HashSet;
import java.util.Set;

public class TestSubSumArrayZero {
	
	public static void main(String args[]) {
		
		int[] arr = { 4, -6, 3, -1, 4, 2, 7 };
		
		sumSubArray(arr);
		
		
	}
	
	
	
	
	private static void sumSubArray(int[] arr) {
	    
		Set<Integer> set = new HashSet<Integer>();
		
		// insert 0 into set to handle the case when sub-array with
		// 0 sum starts from index 0
		
		set.add(0);
		int sum = 0;
		
		//traverse the given array
		for(int i = 0 ; i < arr.length; i++) {
			
			//sum of elements so far
			sum+= arr[i];
			
			// if sum is seen before, we have found a sub-array with 0 sum
			if(set.contains(sum)) {
				 System.out.println("Set" +set);
				//return true;
			}
			
			//insert sum so far into set
			set.add(sum);		
		}
		
	}

}
