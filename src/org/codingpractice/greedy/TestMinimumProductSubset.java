package org.codingpractice.greedy;

public class TestMinimumProductSubset {
	static int min = Integer.MAX_VALUE;
	/**
	 * Given an array a, we have to find minimum product possible with the 
	 * subset of elements present in the array. 
	 * The minimum product can be single element also.
	 * 
	 * If there are even number of negative numbers and no zeros, 
	 * the result is the product of all except the largest valued negative number.
       
       If there are an odd number of negative numbers and no zeros, 
       he result is simply the product of all.
     
       If there are zeros and positive, no negative, the result is 0. 
       The exceptional case is when there is no negative number and all other 
       elements positive then our result should be the first minimum positive number.
	 */
	
	
	    static int minProductSubset(int arr[], int n) {
	    	
	    	if( n == 1)
	    		return arr[0];
	    	
	    	 // Find count of negative numbers, 
	    	 // count of zeros, maximum valued  
	    	 // negative number, minimum valued 
	    	// positive number and product of  
	        // non-zero numbers 
	    	
	    	int negMax = Integer.MIN_VALUE;
	    	int posMin = Integer.MAX_VALUE;
	    	int count_neg = 0;
	    	int count_zero = 0;
	    	
	    	int product = 1;
	    	
	    	for(int i = 0 ; i < n ; i++) {
	    		
	    		 // if number is zero,count it 
	            // but dont multiply 
	    		if(arr[i] == 0) {
	    			count_zero++;
	    			continue;
	    		}
	    		
	    		// count the negative numbers 
	            // and find the max negative number 
	    		
	    		if(arr[i] < 0) {
	    			count_neg++;
	    			negMax = Math.max(negMax, arr[i]);
	    		}
	    		
	    	    
	            // find the minimum positive number 
	    		if(arr[i] > 0 && arr[i] < posMin) 
	    			posMin = arr[i];
	    			
	    			product*= arr[i];		
	    	}
	    	
	    	 // if there are all zeroes 
	        // or zero is present but no  
	        // negative number is present 
	    	 if(count_zero == n || (count_neg == 0 && count_zero >0)) {
	    		 return 0;
	    	 }
	    	
	    	 // If there are all positive 
	    	 if(count_neg == 0)
	    		 return posMin;
	    	 
	    	  // If there are even number except  
	         // zero of negative numbers  
	    	 if(count_neg %2 == 0 && count_neg != 0) {
	    		 
	    		 // Otherwise result is product of 
	             // all non-zeros divided by maximum 
	             // valued negative. 
	    		 product = product / negMax;  
	    	 }
	    	   return product; 
	    }
	
	
	
	
	
	 public static void main(String args[]) {
		 int a[] = { -1, -1, -2, 4, 3 }; 
	        int n = 5; 
	          
	        System.out.println(minProductSubset(a, n)); 
	
	 }
	
	


}
