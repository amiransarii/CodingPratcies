package org.codingpractice.randomproblems;

import java.util.HashMap;
import java.util.Map;

public class TestStringhasUniqueCharacter {
	
	public static void main(String args[]) {
		
		
		System.out.println(isUnique("Alive is awesome"));
		System.out.println(isUnique("Live present moment"));
		System.out.println(isUnique("Alive swum"));
		
		
	}
	
	
	
	
	
	
	
	private static boolean isUnique(String str) {
		boolean result = false;
		
		//using java 8
		char[] chArr = str.toCharArray(); // convert string to char array
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : chArr) {
			
			  if(!map.containsKey(ch)) {
				  map.put(ch, 1);
			  }
			  else {
				  map.put(ch, map.get(ch) +1);
			  }
			
			if(map.get(ch) >= 2) {
				return false;
			}	
		}
		
		return true;
		
	
	}

}
