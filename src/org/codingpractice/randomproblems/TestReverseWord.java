package org.codingpractice.randomproblems;

public class TestReverseWord {
	
	private static String result ="";
	
	public static void main(String args[]) {
		
		String str = "the sky is blue";
        String result ="";
	// String rev = reveseString(str, str.length() -1);
	 
	 //System.out.println(rev);

	 System.out.println("Reverse Word");
	 System.out.println(reverseWord(str));
	}
	
	
	
	
	
	 //reverse word
	 private static String reverseWord(String str) {
		 
		 String[] strArr = str.split(" ");
		 String result = "";
		 
		 for(int i = strArr.length -1 ; i >=0 ; i--) {
			  result += strArr[i] +" ";	 
		 }
		 
		 return result;
		 
		 
	 }
	
	
	//using recursive
	
	private static String reveseString(String str ,int length) {
		
		 if(str == null || length < 0) {
			 return "";
		 }
		 else {
			 result += str.charAt(length);
			   
			reveseString(str, length -1);
			 
		 }
			  
		   return result;
		 
		
		
	}

}
