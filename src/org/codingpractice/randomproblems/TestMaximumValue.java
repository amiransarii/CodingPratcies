package org.codingpractice.randomproblems;

public class TestMaximumValue {
	
	private static int max = Integer.MIN_VALUE;
	
	public static void main(String args[]) {
		
		int[] num = {173,29,391,41};
		
		int max = findMax(num, 0);
		
		System.out.println("Maximum value "+max);
		
		
	}

	
	
	
	
	
	private static int  findMax(int [] arr , int index) {
		   
		 if(arr == null ) { //base case
			 return  -1; 
		 }
		 
		 if(index >= arr.length)
		 {
			 return max;
		 }
		 if(arr[index] > max) {
			 max = arr[index];
		 }
		// else {
			findMax(arr, index +1);
		 //}
		  
		
		 return max;
		
	}
}
