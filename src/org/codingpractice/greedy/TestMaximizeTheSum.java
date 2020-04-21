package org.codingpractice.greedy;

import java.util.Arrays;

/**
 * 
 *Given an array of N integers. You are allowed to rearrange the element of the array. 
 *The task is to find the maximum value of arr[i]*i, where i = 0, 1, 2,…., n – 1
 *
 */
public class TestMaximizeTheSum {

	static int maxSum(int[] arr, int n) {
		
		// Sort the array
		 Arrays.sort(arr);
		 
		// Finding the sum of arr[i]*i 
		 int sum = 0;
		 
		// Finding the sum of arr[i]*i 
		 for(int i = 0 ; i < n ; i++) 
			 sum += (arr[i] *i);
		 
		return sum;
	}
	
	// Driven Program 
    public static void main(String[] args) 
    { 
    int arr[] = { 3, 5, 6, 1 }; 
    int n = arr.length; 
  
    System.out.println(maxSum(arr, n)); 
  
    } 
	
	
	
	
	
	
}
