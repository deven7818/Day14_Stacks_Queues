package com.stacksAndqueues;

/**
 * In this class we have defined the Operations of the Stack;
 * Procedure:
 * 1. We have created a method isEmpty to check if the LinkedList or Stack is empty or not.
 * 2. We have created the addElement method to add the data to the Stack.
 * 3. Method display to print the stack
 * 4. Method for peck and pop elements from stack still the stack get empty
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
	
	
	/**
	 * [2] Method to peck element from stack
	 * 1. Check if stack is not null then print top element from stack
	 * 2. else print Stack is empty
	 * 
	 */
	public void peak() {
		if(head != null) {
			System.out.println("\nTop of the Stack is " + head.data);
		}else {
			System.out.println("Stack is Empty");
			return;
		}
	}
	
	/**
	 *[2]  Method to top element from stack
	 * 1. pop element from stack
	 * 2. return head 
	 * 
	 */
	public Node pop() {
		System.out.println("Popped Element is : "+head.data );
		head = head.next;
		return head;
	}
	
}
