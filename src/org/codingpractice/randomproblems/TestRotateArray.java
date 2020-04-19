package org.codingpractice.randomproblems;

public class TestRotateArray {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println("Before Rotation");
		printArray(arr);
		
		System.out.println("After Rotation");
		rotateByOrder(arr, 3);
		printArray(arr);
		
		
		
	}
	
	
	
	
	private static void printArray(int[] arr) {
		
		int size = arr.length;
		
		
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
	
	 //rotate array buy order
	
	 private static void rotateByOrder(int[] arr, int order) {
		 
		 int size = arr.length;
		 
		 for(int i =  0 ;  i < order ; i++) {
			 
			 
			 for(int j = arr.length -1 ; j > 0; j--) {
				 
				 int temp = arr[j];
				 arr[j] = arr[j - 1];
				 arr[j - 1] = temp;
				 
			 } 		 
		 }
		 		 
	 }
	
	
	

}
