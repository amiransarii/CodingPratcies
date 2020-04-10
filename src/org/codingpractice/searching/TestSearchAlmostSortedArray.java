package org.codingpractice.searching;

public class TestSearchAlmostSortedArray {
	
	
	
	private static int getSearchIndex(int[] arr, int low,int high, int key) {
		
		
		while(low <= high) {
			
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == key)
				return mid;
			
			 if(mid > low && arr[mid -1] == key)
				return mid - 1;
			
			 if(mid < high && arr[mid +1] == key)
				 return mid +1;
			 
			 if(arr[mid] > key)
				 return getSearchIndex(arr, low,mid -2, key);
			 
			 return getSearchIndex(arr, mid +2,high, key);		
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int[] arr = {3,2,10,4,40};
		int x = 4;
		
		int index = getSearchIndex(arr, 0, arr.length-1, x);
		
		System.out.println("Value Found At Index "+index);
		
		
	}

}
