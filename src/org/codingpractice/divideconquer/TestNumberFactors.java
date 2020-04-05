package org.codingpractice.divideconquer;

/**
 * 
 * @author amir.ansari
 * find the number ways of number
 * factor which sum is n
 */
public class TestNumberFactors {
	
	public static void main(String args[]) {
		
		System.out.println(waysToGetN(4));
		System.out.println(waysToGetN(5));
		System.out.println(waysToGetN(6));
	}

	private static int waysToGetN(int n) {
		
		if(n == 0 || n == 1 || n == 2) {
			return 1;
		}
		
		else if(n == 3) {
			return 2;
		}
		
		else {
			int subtract1 = waysToGetN(n - 1);// if we subtract 1, we will be left with 'n-1'
			int subtract3 = waysToGetN(n-3);// if we subtract 3, we will be left with 'n-3'
			int subtract4 = waysToGetN(n-4);// if we subtract 4, we will be left with 'n-4'
			
			return subtract1 + subtract3 + subtract4;
		}
		
		
		
	}
}
