package com.dsa.queue;

public class QueueClass2 {
	public static void main(String[] args) {

		QueueImplementation2 queue = new QueueImplementation2(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		System.out.println(queue.front());
		System.out.println(queue.rear());

		queue.enqueue(60);
		queue.isFull();
		System.out.println(queue.dequeue());
		queue.display();

	}

}
