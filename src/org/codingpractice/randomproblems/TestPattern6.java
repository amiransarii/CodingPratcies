package org.codingpractice.randomproblems;

public class TestPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		pattern6(num);
	}
	
	
	
	
	private static void pattern6(int num) {
		
	 for(int i = num; i >= 1 ; i--) {
		 
		 for(int j = i ; j >= 1; j--) {
			 System.out.print(j +" ");
		 }
		 System.out.println();
	 }
		
	}

}
