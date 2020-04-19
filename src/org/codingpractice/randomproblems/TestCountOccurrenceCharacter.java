package org.codingpractice.randomproblems;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCountOccurrenceCharacter {
	
            
	public static void main(String args[]) {
		String str = "Alive is awesome".trim();
		 occuranceCharacter(str);
	}
	
	
	private static void occuranceCharacter(String str) {
		
		List<Character> charList = str.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
		
		Map<Character, Long> map = charList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 map.forEach((k,v) ->{
			 System.out.println( k +" "+v);
		 });
		
		
		
	}

}


