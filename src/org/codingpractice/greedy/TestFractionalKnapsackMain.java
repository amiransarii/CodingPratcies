package org.codingpractice.greedy;
import java.util.*;

import org.codingpractice.entity.FractionalKnapsackItem;
public class TestFractionalKnapsackMain {
	
	public static void main(String args[]) {
		
		//Create Array of Objects
		 List<FractionalKnapsackItem> fItemsList = new ArrayList<FractionalKnapsackItem>();
		
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		int capacity =10;
		
		for(int i = 0 ; i < value.length;i++) {
			fItemsList.add(new FractionalKnapsackItem(i +1,value[i],weight[i]));
		}
		
		knapsackItemTaken(fItemsList,capacity);
	}
	
	
	
	     
	private static void knapsackItemTaken(List<FractionalKnapsackItem> fItemsList,int capacity) {
		 //sort the items based on ratio
		 fItemsList.sort(Comparator.comparingDouble(FractionalKnapsackItem::getRatio).reversed()); //sort double value decreasing order
		  
		 int usedCapacity = 0;
		 double totalValue = 0;
		 
		  for(int i = 0 ; i < fItemsList.size();i++) {
			  FractionalKnapsackItem fItem = fItemsList.get(i);
				//if full consumption possible then consume it
			  if(usedCapacity + fItem.getWeight() <= capacity) {
				  usedCapacity+=fItem.getWeight();
					System.out.println("Taken: "+fItem);
					totalValue += fItem.getValue();
			  }
			  else {
				//else consume fractionally
				int usedWeight = capacity -usedCapacity;
				
				double value = fItem.getRatio()*usedWeight;
				System.out.println("Taken: "+"item index = " + fItem .getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + fItem .getRatio()
				+ "]");
				 
				usedCapacity+=usedWeight;
				totalValue+=value;
			  }
			//if capacity is full then break
				if(usedCapacity==capacity)break;
			  
		  }
		//print finally obtained value
			System.out.println("\nTotal value obtained: "+ totalValue);
		 
		
		
	}

}
