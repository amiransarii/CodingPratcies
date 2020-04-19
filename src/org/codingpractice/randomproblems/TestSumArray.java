package org.codingpractice.randomproblems;

import java.util.HashMap;
import java.util.Map;

public class TestSumArray {
	
	private int sum = 0;
	public static void main(String args[]) {
		
		int [] arr = {8,7,2,5,3,1};
		int sum = 10;
		sumOfPair(arr, sum, arr.length);
	
	}
	
	
	
	private static void sumOfPair(int[] arr, int sum,int size) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int twice_count = 0;
		
		for(int i = 0 ; i < size ; i++) {
			
			// initializing value to 0, if key not found 
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);		
			 hm.put(arr[i], hm.get(arr[i]) +1);
		
		}
		
		// iterate through each element and increment the 
        // count (Notice that every pair is counted twice) 
		 for(int i = 0 ;i < size ; i++) 
			 	twice_count += hm.get(sum - arr[i]);
			 
		  
		
		
		
		
	}

}
