package org.codingpractice.randomproblems;

/**
 * 
 * @author amir.ansari
 * calculate length of the two subsequnce which have same length
 *
 */
public class TestLongestSpan {
	
	public static void main(String args[]) {
		
		 int arr1[] = new int[]{0, 1, 0, 1, 1, 1, 1}; 
	    int arr2[] = new int[]{1, 1, 1, 1, 1, 0, 1}; 
	    
	    int subSeqLength = getSubSequenceLength(arr1, arr2);
	    
	    System.out.println("SubSequnce length "+subSeqLength);
	}

	
	
	
	
	
	private static int getSubSequenceLength(int[] arr1, int [] arr2) {
	     
    	int n = arr1.length;        // no of elements
		int maxLength = 0;
		
		for(int i = 0; i < n; i++) {
			
			int sumArr1 = 0;
			int sumArr2 = 0;
			
			for(int j =i ; j < n; j++) {
				
				sumArr1+= arr1[j];
				sumArr2+= arr2[j];
				
				if(sumArr1 == sumArr2) {
					int length = j-i +1;
					
					if(length > maxLength) {
						maxLength= length;
					}
					
				}
				
				
			}
			
			
			
		}
		return maxLength;
		
	}
}
