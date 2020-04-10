package org.codingpractice.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TestConvertAnArrayToReducedForm {

	/**
	 * Input:  arr[] = {10, 40, 20}
       Output: arr[] = {0, 2, 1}
	 */
	/**
	 * 
	 1) Create a temp array and copy contents of given array to temp[]. This takes O(n) time.
     2) Sort temp[] in ascending order. This takes O(n Log n) time.
     3) Create an empty hash table. This takes O(1) time.
     4) Traverse temp[] form left to right and store mapping of numbers and their values 
     (in converted array) in hash table. This takes O(n) time on average.
     5) Traverse given array and change elements to their positions using hash table. 
     This takes O(n) time on average.
	 */
	
	static void convert(int[] arr, int n) {
		
		 // Create a temp array and copy contents 
        // of arr[] to temp 
		int temp[] = arr.clone();
		
		//sort temp array
		Arrays.sort(temp);
		
		// Create a hash table. 
		HashMap<Integer, Integer> umap = new HashMap<Integer, Integer>();
		 // One by one insert elements of sorted 
         // temp[] and assign them values from 0 
         // to n-1 
		 
		int val = 0;
		for(int i = 0 ; i < n; i++) {
			umap.put(temp[i], val++);
			
		}
		
		// Convert array by taking positions from 
        // umap 
		for(int i = 0 ;  i< n; i++) {
			arr[i] = umap.get(arr[i]);
		}
		
	}
	 public static void printArr(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	 
	 // Driver code 
	    public static void main(String[] args)  
	    { 
	  
	        int arr[] = {10, 20, 15, 12, 11, 50}; 
	        int n = arr.length; 
	  
	        System.out.println("Given Array is "); 
	        printArr(arr, n); 
	  
	        convert(arr , n); 
	  
	        System.out.println("\n\nConverted Array is "); 
	        printArr(arr, n); 
	  
	    } 
}
