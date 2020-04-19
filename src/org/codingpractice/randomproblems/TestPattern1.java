package org.codingpractice.randomproblems;

public class TestPattern1 {
	
	public static void main(String args[]) {
		int n = 7;
		
		printPatterOfN(n);
		
	}
	
	
	
	
	private static void printPatterOfN(int n) {
	
		for(int i = 1; i <= n ; i++) {
			
			for(int j = 1 ; j <= i; j++) {
				System.out.print(j +" ");
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
