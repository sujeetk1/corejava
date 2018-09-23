/**
 * 
 */
package com.linklist;

import com.linklist.CreateSingleLinkList.Node;

/**
 * @author sujeetk1
 *
 */
public class DeleteHeadLinkedList {
	
	private Node head;
	
	/*
	 * Inner class which will be having value and next node reference
	 */
	static class Node{
		int value;
		Node next;
		/*
		 * Argument Constructor
		 * @param value of the node
		 * @param next node reference
		 */
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
