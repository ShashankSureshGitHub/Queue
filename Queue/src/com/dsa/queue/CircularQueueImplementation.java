package com.dsa.queue;

public class CircularQueueImplementation {

	int capacity;
	int front, rear;
	int[] queue;

	CircularQueueImplementation(int cap) {
		capacity = cap;
		front = -1;
		rear = -1;
		queue = new int[capacity];
	}

	public boolean isFull() {
		if ((front == rear + 1) || (front == 0 && rear == capacity - 1)) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return front == -1;

	}

	public int front() {
		return queue[front];
	}

	public int rear() {
		return queue[rear];
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Overflow, cannot add");
			return;
		}
		if (isEmpty())
			front = 0;
		rear = (rear + 1) % capacity;
		queue[rear] = element;
		System.out.println(element + " enqueued successfully");
	}

	public int dequeue() {
		int item;
		if (isEmpty()) {
			System.out.println("Underflow, cannot remove");
			return Integer.MAX_VALUE;
		} else {
			item = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % capacity;
			}
			return item;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty queue");
		}
		int i;
		for (i = front; i != rear; i = (i + 1) % capacity) {
			System.out.print(queue[i] + " ");
		}
		System.out.print(queue[i] + "\n");

	}
}
