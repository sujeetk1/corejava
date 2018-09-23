package com.linklist;

	/*
	 * Creating and traversing the Single Linked List,
	 * This done bu creating static inner class.
	 */

	/**
	 * @author sujeetk1
	 *
	 */

public class CreateSingleLinkList {
	//Head node of Linked List
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

	public static void main(String[] args) {
		
		CreateSingleLinkList singleLL = new CreateSingleLinkList();
		
		/*
		 *  Initializing head node with value and next node is null
		 */
		singleLL.head = new Node(1, null);
		
		/*
		 *  Creating an independent node with value and next node is null
		 */
		
		Node n1 = new Node(2, null);
		
		/*
		 *  Assigning n1 node to head->next
		 */
		singleLL.head.next = n1;
		
		/*
		 * Print the linked list
		 */
		print(singleLL.head);
	}
	
	/*
	 * Printing the Linked List
	 * @param head node
	 */
	private static void print(Node head){
		
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
		
	}

}
