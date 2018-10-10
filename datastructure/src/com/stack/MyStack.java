package com.stack;

/*
 * Program to create the Stack Algorithm
 */

/**
 * 
 * @author sujeetk1
 *
 * @param <T>
 */
public class MyStack<T> {

	private Object[] t = null;
	
	/*
	 * default constructor, initializing the array
	 */
	public MyStack() {
		t = new Object[10];
	}
/*
 * Method is checking if space is there or not if array is full, then increase the size of an array
 */
	public void ensureCapacity() {
		Object[] temp = null;
		int i = 0;
		boolean fill = false;
		//Checking the array is full or not
		while(i < this.t.length){
			if(t[i] == null){
				fill = true;
				break;
			}
			i += 1;
		 }
		//Array is full, now double the size of the array 
		if(!fill){
			temp = new Object[this.t.length * 2];
			int len = this.t.length - 1;
			for(int j = temp.length - 1; j >= 0 ; j--){
				if(len == -1) break;
				temp[j] = this.t[len];
				len -= 1;
			}
			t = temp;
		}
	}
	/*
	 * Push (add) the element to the array
	 */
	public void push(T t) {
		ensureCapacity();
		for (int i = this.t.length - 1; i >= 0; i--) {
			if (this.t[i] == null) {
				this.t[i] = (Object) t;
				break;
			}
		}
	}
	/*
	 * remove the top element from the array
	 */
	public T pop() {

		T t = null;
		for (int i = 0; i < this.t.length; i++) {
			if (this.t[i] != null) {
				t = (T) this.t[i];
				this.t[i] = null;
				break;
			}
		}

		return t;
	}
	/*
	 * Get the top element from the array
	 */
	public T peek() {

		T t = null;
		for (int i = 0; i < this.t.length; i++) {
			if (this.t[i] != null) {
				t = (T) this.t[i];
				break;
			}
		}
		return t;
	}
	/*
	 * Print the MyStack array
	 */
	public void show() {
		for (int i = 0; i < t.length; i++) {
			if (t[i] != null)
				System.out.println(t[i]);
		}
	}
	/*
	 * main method
	 */
	public static void main(String[] args) {
		
		MyStack<String> myStack = new MyStack<>();

		myStack.push("AAA");
		myStack.push("BBB");
		myStack.push("CCC");
		myStack.push("DDD");
		myStack.push("EEE");
		
		System.out.println(myStack.t.length);
		myStack.show();
		System.out.println("\n");
		
		String poppedElement = myStack.pop();
		System.out.println("Popped Element is ::"+ poppedElement);
		poppedElement = myStack.pop();
		System.out.println("Popped Element is ::"+ poppedElement);
		String peekElement = myStack.peek();
		System.out.println("Top element is :: "+peekElement);
		myStack.show();
		

	}

}
