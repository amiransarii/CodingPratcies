package org.codingpractice.divideconquer;

/**
 * 
 * @author amir.ansari
 * find the sum  of maximum continuous subarray without
 * divide and conquer
 */
public class TestMaximumSubContigousArray {
	
	
	public static void main(String args[]) {
		 
		int[] arr = {-3,5,8,-6,-2};
		
		System.out.println("Using Running time is n3");
		//System.out.println("Sum of Maximum SubArray "+subArrayUsingN3(arr, arr.length));
		
		System.out.println();
		System.out.println("Using Running time is n2");
		//System.out.println("Sum of Maximum SubArray "+subArrayUsingN2(arr, arr.length));
		
		System.out.println();
		System.out.println("Using Divide and Conquer");
		System.out.println("Sum of Maximum SubArray "+subArrayUsingDivideAndConquer(arr, arr.length));
	}

	
	
	
	
	/**
	 * 
	 * @param arr array list
	 * @param n size of array
	 * @return
	 */
	private static int subArrayUsingN3(int[] arr, int n) {
		
		//using brute force algorithm
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i< n; i++) {
			
			for(int j = i ;  j < n;j++) {
				
				for(int k = i ; k <= j;k++) {
					sum = sum + arr[k];
					
					if(max < sum) {
						max = sum;
					}			
				}
				sum = 0;
			}
			
		}
		return max;
			
	}
	
	 //improve running time from n3 to n2
	private static  int subArrayUsingN2(int[] arr, int n) {
		  int sum = 0;
		  int max = Integer.MIN_VALUE;
		  
		  for(int i = 0 ; i < n;i++) {
			  sum = 0; //clear sum
			  
			  for(int j = i ; j < n;j++) {
				  sum = sum + arr[j];
				  
				  if(max < sum) {
					  max = sum;
				  }
			  }
			  
		  }
		
		return max;
		
	}
	
	
	 //maximum sub array using divide and conquer
	 
	 private static int subArrayUsingDivideAndConquer(int[] arr, int n) {
		   int low = 0;
		   int high = n-1;
		   int mid = (low + high) /2;
		   
		   int sum = 0;
		   int leftSum = Integer.MIN_VALUE ;
		   
		   for(int i = mid ; i >= low;i--)  //iterate until low
		   {
			   sum = sum + arr[i];
			    
			   if(sum >leftSum) {
				   leftSum =sum;
			   }
		   }
		   
		 
		   //right sub array
		   int rightSum = Integer.MIN_VALUE;
		   sum = 0;
		   for(int j = mid +1; j <=high;j++) {
			   sum = sum + arr[j];
			   
			   if(rightSum < sum)
			   {
				   rightSum = sum;
			   }
		   }
		  
		   return leftSum  +rightSum;
		 
	 }
	
	
}
