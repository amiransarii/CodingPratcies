package org.codingpractice.greedy;

public class TestMaximumProductSubset {
	/*
	 * Given an array a, we have to find maximum product possible 
	 * with the subset of elements present in the array. The maximum product can be single element also
	 */
	/**
	 * 
	 case 1: If there are even number of negative numbers and no zeros, result is simply product of all
	 
     case 2: If there are odd number of negative numbers and no zeros, result is product of all except
             the largest valued negative number.
             
      case 3: If there are zeros, result is product of all except these zeros with one exceptional case. 
             The exceptional case is when there is one negative number and all other elements are 0. In this case, result is 0.*/
	
	 public static void main(String args[]) {
		 
		  int a[] = {-1, -1, -2, 4, 3}; 
	        int n = a.length; 
	        System.out.println(maxProductSubset(a, n)); 
		 
	 }
	
	 
	  static int maxProductSubset(int arr[], int n) { 
		  
		  if( n == 1) {
			  return arr[0];
		  }
		  
		  // Find count of negative numbers, count  
	       // of zeros, maximum valued negative number 
	       // and product of non-zero numbers 
		  
		  int max_neg = Integer.MIN_VALUE;
		  int count_neg = 0;
		  int count_zero = 0;
		  int prod = 1;
		  
		  for(int i = 0 ; i < n ; i++) {
			  
			// If number is 0, we don't 
	        // multiply it with product. 
		      if(arr[i] == 0) {
		    	  count_zero++;
		    	  continue;
		      }
		      // Count negatives and keep 
	          // track of maximum valued negative. 
		         
		      if(arr[i] < 0) {
		    	  count_neg ++;
		    	  max_neg = Math.max(max_neg, arr[i]);
		      }
		      
		      prod = prod*arr[i];
		  
		  }
		  
		// If there are all zeros 
		  if(count_zero == n)
			  return 0;
		  
		  // If there are odd number of 
	      // negative numbers 
		  
		  if(count_neg % 2 == 1) {
			  
			   // Exceptional case: There is only 
	           // negative and all other are zeros   
			  
			  if(count_neg == 1 && count_zero >0 && count_zero + count_neg == n) {
				  return 0;
			  }
			  // Otherwise result is product of  
	            // all non-zeros divided by maximum 
	            // valued negative. 
			  prod = prod /max_neg;
		  }
		  
		  
		return prod;
		  
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
      
	

}
