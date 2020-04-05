package org.codingpractice.randomproblems;

/**
 * 
 * @author amir.ansari
 * find the leaders
 * leader -> element shoudl be greater than from right 
 * side of all elements
 */
public class TestFindLeaders {
	
	public static void main(String args[]) {
		
		
		int[] arr = {16,17,4,3,5,2};
		int[] arr2 = {16,17,4,3,5,2};
		
		printLeaders(arr, arr.length);
		System.out.println();
		printLeaderFromRight(arr2, arr2.length);
	}
	
	 
	//first method 
	private static void printLeaders(int[] arr, int n) {
	
		for(int i = 0 ; i < n; i++) {
			
			int j = 0;
			
			for(j = i +1 ; j < n; j++) {
				if(arr[i] <= arr[j])
					break;
			}
			
			if(j == n) {
				System.out.print(arr[i] +" ");
			}
		}
			
	}
	
	 //second method scan from right
	 
	/**
	 * scan all the elements from right to left in array and keep track
	 * of the maximum till now. When the maximum changes its' value print
	 */
	
	
	 private static void printLeaderFromRight(int[] arr, int size) {
		 int max_from_right =  arr[size-1]; 
		   
	        /* Rightmost element is always leader */
	        System.out.print(max_from_right + " "); 
	       
	        for (int i = size-2; i >= 0; i--) 
	        { 
	            if (max_from_right < arr[i]) 
	            {            
	            max_from_right = arr[i]; 
	            System.out.print(max_from_right + " "); 
	            } 
	        }     
			 
		 }
		 
		 
		 
		 
	
	
	
	

}
