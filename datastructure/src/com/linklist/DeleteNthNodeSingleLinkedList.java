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
public class DeleteNthNodeSingleLinkedList {
	
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
		
		DeleteNthNodeSingleLinkedList singleLL = new DeleteNthNodeSingleLinkedList();
		
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
		singleLL.head = deleteNthNode(singleLL.head, 0);
		
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
	private static Node deleteNthNode(Node head, int position){

		if(head == null)
			return null;
		
		Node node = head;
		
		if(position == 0){
			head = head.next;
			return head;
		}
		
		// Find previous node of the node to be deleted 
        for (int i=0; node!=null && i<position-1; i++) 
        	node = node.next; 
  
        // If position is more than number of ndoes 
        if (node == null || node.next == null) 
            return node; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = node.next.next; 
  
        node.next = next;  // Unlink the deleted node from list
		
		
		return node;
	}

}
