package org.codingpractice.randomproblems;

public class TestPattern4 {
	
	public static void main(String args[]) {
		
		int num = 7;
		
		pattern4(num);
	}
	
	
	
	
	
	
	private static void pattern4(int num) {
	 
		for(int i = 1 ; i <= num ; i++) {
			
			for(int j = num ; j >= i ; j--) {
				System.out.print(j +" ");
			}
			
			System.out.println();
			//System.out.print( i+" ");
		}
		
		
	}

}
