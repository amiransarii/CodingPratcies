package org.codingpractice.greedy;
/**
 * Activity Selection Problem Using Greedy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codingpractice.entity.GreedyActivity;

public class TestActivitySelectionProblems {
	
	public static void main(String args[]) {
		
		List<GreedyActivity> greedyActivitiesList = new ArrayList<GreedyActivity>();
		
		//add activities into list
		greedyActivitiesList = Arrays.asList(new GreedyActivity("A1", 0, 6),new GreedyActivity("A2", 3, 4),
				new GreedyActivity("A3", 1, 2),new GreedyActivity("A4", 5, 8),new GreedyActivity("A5", 5, 7),new GreedyActivity("A6", 8, 9));

		activitySelection(greedyActivitiesList);
		
	}
	
	

	//method to implement activity selection problem
	private static void activitySelection(List<GreedyActivity> greedyActivitiesList) {
		 
		/*System.out.println("Before Sorting finishing Time");
		greedyActivitiesList.forEach(l ->{
			System.out.println(l.getName() +"  "+ l.getStartTime() + " "+l.getFinishTime());
		}); */
		
		//sort the activity base on finish time using java8
	    greedyActivitiesList.sort((a1,a2) -> (int)a1.getFinishTime() -(int) a2.getFinishTime());
		
	  System.out.println("After Sorting finishing Time");
		greedyActivitiesList.forEach(l ->{
			System.out.println(l.getName() +"  "+ l.getStartTime() + " "+l.getFinishTime());
		}); 
		System.out.println();
	    
	     // now take first activity assume it has less finish time
	      GreedyActivity startActivity = greedyActivitiesList.get(0); //print first activity
		   System.out.println(startActivity.getName() +" "+startActivity.getStartTime() +" "+startActivity.getFinishTime());

	       //start activity will change in every iteration
	      
	      /*now iterate activity from second and compare start time 
	       of current activity is greater than finish time of previous activity
	       if true change start Activity
	      
	      */
	       
	      for(int i = 1 ; i < greedyActivitiesList.size();i++) {
	    	  
	    	  GreedyActivity currentActivity = greedyActivitiesList.get(i);
	    	  
	    	//if job's start time is greater than equal start job's finish time then print job
	    	   if(currentActivity.getStartTime() >= startActivity.getFinishTime()) {
	    		   System.out.println(currentActivity.getName() +" "+currentActivity.getStartTime() +" "+currentActivity.getFinishTime());
	    		   startActivity = currentActivity;
	    	   }    	  
	      }
	}

}
