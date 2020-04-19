package org.codingpractice.randomproblems;

import org.codingpractice.model.SingleNode;

public class TestLinkedListImplementation {
	
	private SingleNode head;
	private SingleNode tail;
	private static int size;
	
	//create a linked list

	//create a linked list
	public void createLinkedList(int value) {
		SingleNode newNode = new SingleNode();
		newNode.setValue(value);
		newNode.setNext(null);
		head = newNode;
		tail = newNode;
		size = 1;
	}
	
	//check linkedlist is empty
	public boolean isLinkedListEmpty() {
		return head == null;
	}
	
	//insert linkedlist
	private void insert(int value,int location) {
		SingleNode  newNode = new SingleNode();
		newNode.setValue(value);		
		
		if(location == 0) { //insert new node as head
			newNode.setNext(head);
			head = newNode;
		}
		
		else if(location >= size) { //insert at last position
			tail.setNext(newNode);
			tail = newNode;
		}
		
		else {  //other location
			 SingleNode temp = head;
			for(int i = 0 ; i < location -1; i++) {
			}
			SingleNode next = temp.getNext();
			newNode.setNext(next);
			temp.setNext(newNode);
		}
		
		size++;
	}
	
	
	private void print() {
		SingleNode current = head;
		for(int i = 0 ; i < size ;i++) {
			
			System.out.print(current.getValue() +" ");
			
			if(i != size -1) {
				System.out.print(" ->");
			}
			current = current.getNext();
			
		}
		
	}
	
	
	
	public static void main(String args[]) {
	
		TestLinkedListImplementation linkedList = new TestLinkedListImplementation();
		
		linkedList.createLinkedList(5);
		
		linkedList.insert(10, size +1);
		linkedList.insert(15, size +1);
		linkedList.insert(20, size +1);
		linkedList.insert(25, size +1);
		linkedList.insert(30, size +1);
		
		linkedList.print();
		
		
		
	}
	
	
	
	
	
	
	
	
}
