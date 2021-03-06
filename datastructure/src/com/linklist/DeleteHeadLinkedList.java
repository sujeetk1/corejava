/**
 * 
 */
package com.linklist;

/*
 * Creating and traversing the Single Linked List,
 * This done by creating static inner class.
 */
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
		
		DeleteHeadLinkedList singleLL = new DeleteHeadLinkedList();
		
		/*
		 *  Initializing head node with value and next node is null
		 */
		singleLL.head = new Node(1, null);
		
		/*
		 *  Creating an independent node with value and next node is null
		 */
		
		Node n1 = new Node(2, new Node(3, null));
		
		/*
		 *  Assigning n1 node to head->next
		 */
		singleLL.head.next = n1;
		
		/*
		 * Print the linked list
		 */
		print(singleLL.head);
		
		/*
		 * Deleting the head node
		 * @param head node
		 * @return return node after deleting the head node
		 */
		singleLL.head = deleteHead(singleLL.head);
		
		/*
		 * Print the linked list after deletion of the head node
		 */
		print(singleLL.head);
	}
	
	/*
	 * Printing the Linked List
	 * @param head node
	 */
	private static void print(Node head){
		
		while(head != null){
			System.out.println("val ::"+head.value);
			head = head.next;
		}
		
	}
	
	/*
	 * Deleting the head node
	 * @param head node
	 * @return return node after deleting the head node
	 */
	private static Node deleteHead(Node head){
		Node node = null; 
		if(head != null){
			System.out.println("Deleted node Value is ::"+head.value);
			/*
			 * Assigning the head->next to node and 
			 * after this return the node
			 */
			node = head.next;
			//Assigning head->next to null
			head.next = null;
		}
		return  node;
	}

}
