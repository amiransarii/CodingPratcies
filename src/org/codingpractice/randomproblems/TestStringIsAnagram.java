package org.codingpractice.randomproblems;

import java.util.Arrays;

public class TestStringIsAnagram {
	
	public static void main(String args[]) {
		
		
		System.out.println(isStringAnagram("now","OWN "));
		System.out.println(isStringAnagram("ton","NOT "));
		System.out.println(isStringAnagram("fiber"," Brief"));
		System.out.println(isStringAnagram("Amir","amirkk"));
	}
	
	
	
	
	
	
	
	private static boolean isStringAnagram(String str1,String str2) {
		//convert string to chararray
		char[] arr1 = str1.toLowerCase().trim().toCharArray();
		char[] arr2 = str2.toLowerCase().trim().toCharArray();
		
		//sort the arrau
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
		
	}

}
