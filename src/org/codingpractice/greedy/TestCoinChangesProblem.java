package org.codingpractice.greedy;

import java.util.Arrays;

/**
 * 
 * @author amir.ansari
 *Implementation of Coin Change Problem
 *Using Greedy
 */
public class TestCoinChangesProblem {
	
	public static void main(String args[]) {
		int [] coins = {1, 2, 5, 10, 50, 100, 500,2000};
		int amount = 2758;
		System.out.println("Coins available: "+Arrays.toString(coins));
		
		Arrays.sort(coins);
		int numberofcoins= coinChangeTask(coins,amount);
		
		System.out.println("Number of Coins "+numberofcoins);
		
	}
	
	
	/**
	 * 
	 * @param arr array of coin
	 * @param target is result to achieve from coin's array
	 */
	private static int coinChangeTask(int[] coinArr, int target) {
		
	        int index = coinArr.length - 1;
	        int numberOfNotes =0;
	        
	        while(true) { //iterate until achieve the result
	         
	        	int coinValue = coinArr[index];
	        	index --;
	        	int maxAmount = (target/coinValue)*coinValue; //maximum denomination
	        	if(maxAmount >0) {
	        		System.out.println("Coin value: "+coinValue+ " taken count: "+(target/coinValue));
	        		target = target - maxAmount;
	        		numberOfNotes++;
	        	}
	        	if(target <=0) {
	        		break;
	        	}
	        	
	        }
	
	    
return numberOfNotes;
	}
	
	
}
