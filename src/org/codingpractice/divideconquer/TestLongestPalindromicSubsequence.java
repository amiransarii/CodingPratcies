package org.codingpractice.divideconquer;

public class TestLongestPalindromicSubsequence {
	
	public static void main(String[] args) {
		TestLongestPalindromicSubsequence lps = new TestLongestPalindromicSubsequence();
		System.out.println("Longest Palindromic Sequence: " + lps.findLPSLength("elrmenmet"));
	}// end of method
	
	
	public int findLPSLength(String st) {
		return LPSAux(st, 0, st.length() - 1);
	}// end of method
	
	private int LPSAux(String str, int startIndex, int endIndex) {
	
		if(startIndex > endIndex) {//BASE CASE - If we have traversed more than 1/2 of string 
			//then return 0 as we dont need to process it
			return 0;
		}
		
		if(startIndex == endIndex) { //BASE CASE - If both the index are at same position
			//then its a palindrome as its 1 character.
			return 1;
		}
		
		int count1 = 0;
		
		if(str.charAt(startIndex) == str.charAt(endIndex)) {//CASE#1 - If index pointed characters 
			//matches then we add 2 to the existing known palindrome length
			count1 = 2 + LPSAux(str, startIndex + 1, endIndex - 1);
		}
		
		int Count2 = LPSAux(str, startIndex + 1, endIndex); //CASE#2 - Skip one element from beginning
		int Count3 = LPSAux(str, startIndex, endIndex - 1); //CASE#3 - Skip one element from end
		
		
		return Math.max(count1, Math.max(Count2, Count3));
		
	}

}
