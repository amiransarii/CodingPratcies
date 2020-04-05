package org.codingpractice.randomproblems;

/**
 * 
 * @author amir.ansari
 * calculate the minum distance between two 
 * elements
 *
 */
public class TestMinimuDistance {
	
	public static void main(String args[]) {
		
		 int[] arr = {1, 2, 3, 2};
		int minDis = getMinimDistance(arr,1, 2, 4);
		System.out.println("Min Distance "+minDis);
		
	}
	
	
	
	
	
	private static int getMinimDistance(int[] arr, int x, int y,int n) {
		int minDistance = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < n;i++) {
			
			for(int j = i +1; j< n;j++) {
				
				if(((arr[i] == x && arr[j] ==y) || (arr[i] == y && arr[j]==x)) && minDistance >Math.abs(i - j))
				{
					minDistance = Math.abs(i - j);
				}	
			}
			
		}
		return minDistance;
		
		
	}

}
