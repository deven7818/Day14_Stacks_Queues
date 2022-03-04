package com.stacksAndqueues;


/**
 * In this class we have defined the Operations of the Queue;
 * Procedure:
 * 1. Created constructor 
 * 2. Created enQueue Method display front and rear element
 */


public class Queue {

	QNode front ,rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
		
	}
	/**
		 * [1] Method to get front and rear element from queue
		 * 1. Check if stack is empty or not
		 * 2. If empty then assign head to newNode
		 * @param key - to get value
		 */
	public void enQueue(int key) {
		QNode temp = new QNode(key);
		
		if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}
}
