package org.codingpractice.randomproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestFirstNonRepeatedCharacter {
	
	private static Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
	
	 public static void main(String args[]) {
		 
		 String str="stress";
	 
	  char  result = nonRepeacterChar(str);
	  
	  System.out.println("Non repeated Character "+result);
	 }
	
	
	
	
	static char nonRepeacterChar(String str) {
		char ch = '0';
		
		//convert string to charArray
		char[] charArr = str.toCharArray();
		
		 for(char c : charArr) {		 
			 if(!map.containsKey(c)) {
				 map.put(c, 1);
			 }
			 else {
				 map.put(c, map.get(c) +1);
			 }	

			
		 }
		  System.out.println(map);
		
		ch = map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
				 
		 
		return ch;
	}

}
