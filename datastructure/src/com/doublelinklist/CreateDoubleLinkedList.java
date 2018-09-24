/**
 * 
 */
package com.doublelinklist;

/*
 * Creating and traversing the Double Linked List,
 * This done by creating static inner class.
 */

/**
 * @author sujeetk1
 *
 */
public class CreateDoubleLinkedList {
	
	private Node head;
	
	static class Node{
		int value;
		Node next;
		Node previous;
		
		Node(int value, Node next, Node previous){
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreateDoubleLinkedList dlist = new CreateDoubleLinkedList();
		
		dlist.head = new Node(1, null, null);
		
		Node n1 = new Node(2, null, null);
		
		dlist.head.next = n1;
		n1.previous = dlist.head;
		
		Node n2 = new Node(3, null, null);
		n1.next = n2;
		n2.previous = n1;
		
		Node n3 = new Node(4, null, null);
		n2.next = n3;
		n3.previous = n2;
		
		printList(dlist.head);
		
		
	}
	
	
	private static void printList(Node head){
		
		
		
	}

}
