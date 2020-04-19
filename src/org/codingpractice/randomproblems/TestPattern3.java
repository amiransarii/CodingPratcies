package org.codingpractice.randomproblems;

public class TestPattern3 {
	
	public static void main(String args[]) {
		int n = 7;
		
		patter3(n);
	}
	
	
	
	
	
	
	
	private static void patter3(int n) {
	
		for(int i = 1; i <= n ; i++) {
			
			
			for(int j = 1 ; j <= i; j++) {
				
				System.out.print(i +" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
