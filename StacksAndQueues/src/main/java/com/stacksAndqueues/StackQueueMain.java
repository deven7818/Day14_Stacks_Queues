package com.stacksAndqueues;

/**
 * Main method for stack
 * Created Object of Stack to call Methods of Stack 
 *
 */

public class StackQueueMain {

	public static void main(String[] args) {
		System.out.println("Stack And Queue ");
		
		Stack stack = new Stack();
		
		/*
		 * Added Elements to stack
		 */
		stack.addElement(56);
		stack.addElement(30);
		stack.addElement(76);
		
		/*
		 * Display Stack Elements
		 */
		stack.display();
		
		/*
		 * peck and pop all the elements from stack
		 */
		stack.peak();
		stack.pop();

		stack.peak();
		stack.pop();

		stack.peak();
		stack.pop();
		stack.display();
	}

}
