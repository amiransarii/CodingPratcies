package org.codingpractice.stack;

public class TestNextGreaterElement {
	
	 static void printGreaterElement(int [] arr, int n) {
		 
		 for(int i = 0 ; i < n ; i++) {
			 
			 for(int j = i +1 ; j < n ; j++) {
				 
				 if(arr[j] > arr[i]) {
					 System.out.print(arr[j] +" ");
					 break;
				 }
						 
			 }
			 
		 }
		 System.out.print(" -1");
		 
	 }
	 
	 public static void main(String args[]) {
		 
		 int[] arr = {4,5,2,25};
		 
		 printGreaterElement(arr, arr.length);
		 
		 
		 
		 
	 }

}
