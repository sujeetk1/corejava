package com.linklist;

public class CreateSingleLinkList {
	
	private Node head;
	
	static class Node{
		int value;
		Node next;
		
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return "Value ::"+this.value;
		}
	}

	public static void main(String[] args) {
		
		CreateSingleLinkList singleLL = new CreateSingleLinkList();
		
		singleLL.head = new Node(1, null);
		
		Node n1 = new Node(2, null);
		
		singleLL.head.next = n1;
		
		print(singleLL.head);
	}
	
	private static void print(Node head){
		
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
		
	}

}
