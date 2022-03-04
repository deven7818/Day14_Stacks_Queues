package com.stacksAndqueues;

/**
 * In this class we have defined the Operations of the Stack;
 * Procedure:
 * 1. We have created a method isEmpty to check if the LinkedList or Stack is empty or not.
 * 2. We have created the addElement method to add the data to the Stack.
 * 3. Method display to print the stack
 */
public class Stack {
	
	public static Node head;
	
		public boolean isEmpty() {
		return head == null;
	}
		/**
		 * [1] Method to add Element to stack
		 * 1. Check if stack is empty or not
		 * 2. If empty then assign head to newNode
		 * @param data 
		 */
	public void addElement(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	/**
	 *  Method to display Elements in stack
	 * 1. Check if stack is empty then print stack is empty
	 * 2. If empty then assign currentNode to head
	 * 3. Check if current Node is not empty then print the data
	 * 
	 */
	public void display() {

		if(isEmpty()) {
			System.out.println("Stack is Empty");
			
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		}
	
	}	
}
