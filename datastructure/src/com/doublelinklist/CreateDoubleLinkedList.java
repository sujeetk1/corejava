/**
 * 
 */
package com.doublelinklist;

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
		// TODO Auto-generated method stub

	}

}
