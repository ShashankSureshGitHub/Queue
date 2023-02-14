package com.dsa.queue;

public class CircularQueue {

	public static void main(String[] args) {
		CircularQueueImplementation queue = new CircularQueueImplementation(6);

		queue.dequeue();// Underflow condition

		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(16);
		queue.enqueue(18);
		queue.enqueue(20);

		queue.display();
		queue.dequeue();
		queue.dequeue();

		queue.display();

		queue.enqueue(22);
		queue.enqueue(24);
		queue.enqueue(26);
		queue.enqueue(28);// Overflow condition
		queue.display();
	}

}
