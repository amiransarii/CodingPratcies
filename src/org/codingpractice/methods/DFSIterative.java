package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.Stack;

import org.codingpractice.entity.GraphNode;

public class DFSIterative {
	
	private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	public DFSIterative(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	
	public void dfs() {
		//if a node is unvisited then run dfs on it
		for(GraphNode node : nodeList) {
			
			if(!node.isVisited())
				dfsVisit(node);	
		}	
	}
	
	  //dfs traversal by a source node
	   public void dfsVisit(GraphNode node) {
		   
		 //make an empty stack
		   Stack<GraphNode> stack = new Stack<GraphNode>();
		   
		  //add source node to stack
		   stack.push(node);
		   
		   
		 //while stack is not empty
		   while(!stack.isEmpty()) {
			   
			 //pop a node from stack
			   GraphNode presentNode = stack.pop();
			   
			   //mark node as visited
			   presentNode.setVisited(true);
			   
			 //print the node
			  System.out.print(presentNode.getName()+" ");
			  
			//for each neighbor of present node
			  for(GraphNode neighbor : presentNode.getNeighbors()) {
				//if neighbor is not visited then add it to queue
				  if(!neighbor.isVisited()) {
					  stack.add(neighbor);
					  neighbor.setVisited(true);
				  }
			  }		   
		   }
		   		   
	   }

		// add an undirected edge between two nodes
		public void addUndirectedEdge(int i, int j) {
			GraphNode first = nodeList.get(i-1);
			GraphNode second = nodeList.get(j-1);
			first.getNeighbors().add(second);
			second.getNeighbors().add(first);
		}
}
