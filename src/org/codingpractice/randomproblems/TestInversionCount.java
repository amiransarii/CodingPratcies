package org.codingpractice.randomproblems;

import java.util.Arrays;

/**
 * 
 * @author amir.ansari
 *find the total number of inversion count
 *
 *explaniation
 *if arr[i] > arr[j && i < j condition
 *
 */
public class TestInversionCount {
	
	public static void main(String args[]) {
		  
		int[] arr = {2,4,1,3,5};
		
		int counts = getInversionCount(arr, arr.length -1);
		System.out.println("Inversion Count Using Brute force "+counts);
		
		System.out.println("Using Divide and Conquer");
		  int[] arr1 = { 1, 20, 6, 4, 5 }; 
		  
	        System.out.println(mergeSortAndCount(arr1, 0, arr.length - 1)); 
	

}



// find the total number of inversion count
//using brute force

private static int getInversionCount(int[] arr, int n) {
	int count =0; //count total of inversion count
	
	for(int i = 0 ; i < n;i++) {
		
		for(int j = i +1; j < n;j++) {
			
			if(arr[i]> arr[j]) {
				count++;
			}
			
		}
	}
	return count;
}

      //inversion counts using divide and conquer
       private static int mergeAndCount(int[] arr, int l,int m,int r) {
    	   
    	   // Left subarray 
           int[] left = Arrays.copyOfRange(arr, l, m + 1); 
     
           // Right subarray 
           int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
     
           int i = 0, j = 0, k = l, swaps = 0; 
     
           while (i < left.length && j < right.length) { 
               if (left[i] <= right[j]) 
                   arr[k++] = left[i++]; 
               else { 
                   arr[k++] = right[j++]; 
                   swaps += (m + 1) - (l + i); 
               } 
           } 
     
           // Fill from the rest of the left subarray 
           while (i < left.length) 
               arr[k++] = left[i++]; 
     
           // Fill from the rest of the right subarray 
           while (j < right.length) 
               arr[k++] = right[j++]; 
     
           return swaps; 
       } 
     
       // Merge sort function 
       private static int mergeSortAndCount(int[] arr, int l, int r) 
       { 
     
           // Keeps track of the inversion count at a 
           // particular node of the recursion tree 
           int count = 0; 
     
           if (l < r) { 
               int m = (l + r) / 2; 
     
               // Total inversion count = left subarray count 
               // + right subarray count + merge count 
     
               // Left subarray count 
               count += mergeSortAndCount(arr, l, m); 
     
               // Right subarray count 
               count += mergeSortAndCount(arr, m + 1, r); 
     
               // Merge count 
               count += mergeAndCount(arr, l, m, r); 
           } 
     
           return count; 
    	   
       }



}