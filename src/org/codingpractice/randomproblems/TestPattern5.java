package org.codingpractice.randomproblems;

public class TestPattern5 {
	
	
	public static void main(String args[]) {
		
		int n = 7;
		
		pattern5(n);
		
	}
	
	private static void pattern5(int num) {
		
		for(int i = num; i >=1 ; i--) {
			
			for(int j = 1; j<= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
			
		}
		
		
	}

}
