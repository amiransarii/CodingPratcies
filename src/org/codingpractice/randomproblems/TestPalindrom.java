package org.codingpractice.randomproblems;

public class TestPalindrom {
	
	
	public static void main(String args[]) {
		
		boolean result = isPalindrome("anmir");
		
		System.out.println(result);
	}
	
	
	
	private static boolean isPalindrome(String str) {
		
		String orig = str.trim();
		String rev ="";
		//convert string to char Array
		
		for(int i = str.length() -1 ; i >=0 ; i--) {
			rev+= str.charAt(i);
		}
	
		if(orig.equals(rev))
			return true;
		
		return false;
	}

}
