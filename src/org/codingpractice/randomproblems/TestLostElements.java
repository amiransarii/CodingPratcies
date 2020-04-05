package org.codingpractice.randomproblems;

/**
 * 
 * find the lost element from array 2
 * arr1 is copy of array2
 * 
 *
 */
public class TestLostElements {
	
	public static void main(String args[]) {
		
		int[] arr1 = {1,4,5,7,9};
		int[] arr2 = {4,5,7,9};
		
		int element = getLostElement(arr1, arr2);
		System.out.println(element);
	}
	
	
	
	
	
	
	private static int getLostElement(int[] arr1, int[]arr2) {
	  int lostelement = Integer.MIN_VALUE;
	  
	  for(int i = 0 ; i < arr1.length;i++) {
		  
		  for(int j = i; j < arr2.length; j++) {
			  
			  if(arr1[i] == arr2[j]) {
				  lostelement = Integer.MIN_VALUE;
				   break;
				  
			  }
			  else {
				  lostelement = arr1[i];
			  }
		  }
		  
	  }
		
	  return lostelement;
		
		
	}

}
