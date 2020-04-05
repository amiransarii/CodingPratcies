package org.codingpractice.randomproblems;

/**
 * 
 * @author amir.ansari
 *print the union of the two sets
 *
 */
public class TestUnionofArraySet {
	
	public static void main(String args[]) {
		
		/**
		 * 1) Use two index variables i and j, initial values i = 0, j = 0
           2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
           3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
            4) If both are same then print any of them and increment both i and j.
             5) Print remaining elements of the larger array.
		 */
		
		int[] arr1 = {1, 3, 4, 5, 7,8,9,10};
		int[] arr2 = {2, 3, 5, 6};
		
		
		unionArray(arr1, arr2, arr1.length, arr2.length);
		
		
	}
	
	
	
	
	
	
	/**
	 * 
	 * @param arr1 first array
	 * @param arr2 second array
	 * @param m size of the first array
	 * @param n size of the second array
	 */
	private static void unionArray(int[] arr1,int [] arr2, int m, int n) {
		
		   int i = 0,j = 0; //initialize i and j 0 and increment it by one
		   
		   while(i < m && j <n ) {
			   
			   if(arr1[i] < arr2[j]) {
				   System.out.print( arr1[i] +" ");
				   i++;
			   }
			   else if(arr2[j] < arr1[i]) {
				   System.out.print(arr2[j]+" ");
				   j++;
				   
			   }
			   else {
				   System.out.print(arr2[j] +" ");
				   i++;
				   j++;
			   }
		   }	
		   
		   /* Print remaining elements of  
	         the larger array */
		   
		    while(i<m) {
		    	System.out.print(arr1[i++]+" "); 
		    }
		    
		    while(j<n) {
		    	  System.out.print(arr2[j++]+" "); 
		    }
	}

}
