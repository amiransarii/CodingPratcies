package org.codingpractice.randomproblems;

public class TestIntersectionOfTwoArrays {
	
	public static void main(String args[]) {
		

		int[] arr1 = {1, 3, 4, 5, 7,8,9,10};
		int[] arr2 = {2, 3, 5, 6};
		
		interSectionArray(arr1, arr2, arr1.length, arr2.length);
	}
	
	
	
	
	
	/**
	 * 
	 * @param arr1 first array
	 * @param arr2 second array
	 * @param m size of the first array
	 * @param n size of the second array
	 */
	
	private static void interSectionArray(int[] arr1, int[] arr2, int m, int n) {
		   
		int i =0, j = 0;
		
		while(i < m && j < n) {
			
			if(arr1[i] < arr2[j] ) {
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				j++;
			}
			
			else {
				System.out.println(arr1[i] +" ");
				i++;
				j++;
			}
			
			
		}
		
		
		
		
		
		
	}

}
