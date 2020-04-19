package org.codingpractice.randomproblems;

import java.util.Arrays;

public class TestIntersectionOfTwoArraysExample {

	public static void main(String args[]) {
		
		int[] arr1 = {1, 3, 4, 5, 7,8,9,10};
		int[] arr2 = {2, 3, 5, 6};
		
		int sizeM = arr1.length;
		int sizeN = arr2.length;
		
	        int i = 0; //arr1 index
	        int j = 0; // arr2 index
	        
	        while(i < sizeM  && j < sizeN) {
	        	
	        	if(arr1[i] < arr2[j]) {
	        		i++;
	        	}
	        	else if(arr1[i] > arr2[j]) {
	        		j++;
	        	}
	        	else {
	        		System.out.print(arr1[i] +" ");
	        		i++;
	        		j++;
	        	}
	        	
	        	
	        	
	        }
		
	}
	
}
