package com.dsa.queue;

public class QueueClass {

	public static void main(String[] args) {

		QueueImplementation1 queue = new QueueImplementation1(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		queue.enqueue(60);
		queue.isFull();
		System.out.println(queue.dequeue());

	}

}
