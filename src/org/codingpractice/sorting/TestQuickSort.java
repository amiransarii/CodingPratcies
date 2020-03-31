package org.codingpractice.sorting;

//sorting array using quick sort
public class TestQuickSort {
	
	private static void quickSort(int[] arr,int start, int end) {
		
		if(start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1 );
			quickSort(arr, pivot + 1,end);
			
		}
		
		
	}

	
	private static int partition(int[] arr, int p, int q) {
		int pivot = q;  //assume last index is pivot
		int i = p - 1;
		//p is first index which is zero index
		
		for(int j =p; j <= q; j++) {
			
			if(arr[j] < arr[pivot]) {
				i++;
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
			}
			
		}
		
		return i;
	}

}
