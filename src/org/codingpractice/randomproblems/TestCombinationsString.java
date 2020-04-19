package org.codingpractice.randomproblems;

public class TestCombinationsString {
	
	
	public static void main(String args[]) {
		
		String str = "wxyz";
		
		combinationString(str,0);
	}
	
	
	
	private static void combinationString(String str,int start) {
	 
		String result ="";
		
		for(int i = start ; i < str.length() ; i++) {
			
			 result += str.charAt(i);
			 System.out.print(result +" ");
			 
			   if(i < str.length() )
				   combinationString(str, i+1);
			   
		}
		
		
		
		
	}

}
