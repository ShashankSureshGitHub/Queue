package com.dsa.queue;

public class QueueImplementation1 {

	int capacity;
	int front, rear;
	int[] queue;

	public QueueImplementation1(int cap) {
		capacity = cap;
		front = -1;
		rear = -1;
		queue = new int[capacity];
	}

	public boolean isFull() {
		if (rear == capacity - 1)
			System.out.println("Overflow, cannot eenqueue");
		return rear == capacity - 1;
	}

	public boolean isEmpty() {
		if (rear == -1)
			System.out.println("Underflow, cannot dequeue");
		return rear == -1;

	}

	public int front() {
		return queue[front];
	}

	public int rear() {
		return queue[rear];
	}

	public void enqueue(int element) {
		if (isFull())
			return;
		if (isEmpty())
			front = 0;
		rear++;
		queue[rear] = element;
		System.out.println(element + " enqueued successfully");
	}

	public int dequeue() {
		if (isEmpty())
			return Integer.MAX_VALUE;
		int removedElement = queue[front++];
		if (front > rear) {
			front = -1;
			rear = -1;
		}
		return removedElement;
	}

}
