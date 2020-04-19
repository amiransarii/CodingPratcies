package org.codingpractice.randomproblems;

import java.util.Arrays;

public class TestCopyArrayElements {
	/**
	 * 
	 * Arrays.copyOf does not only copy elements, it also creates a new array.
	 *  System.arrayCopy copies into an existing array
        System.out.println(Arrays.toString(copied));
	 */
	public static void main(String args[])
	{
		
		//using system.arraycopy
		int[] arr = {1,2,3,4,5};
		
		int [] copied = new int[10];
		
		System.arraycopy(arr, 0, copied, 1, 5); //5 is the length to copy
	
	    System.out.println(Arrays.toString(copied));
	    
	    //using  array copy of
	    
	    int[] copied2 = Arrays.copyOf(arr, 10);//10 the the length of the new array
	    
	    System.out.println(Arrays.toString(copied2));
	    copied = Arrays.copyOf(arr,3);
	    System.out.println(Arrays.toString(copied));
	    
	
	}
}
