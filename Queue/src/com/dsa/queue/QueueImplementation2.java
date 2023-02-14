package com.dsa.queue;

public class QueueImplementation2 {
	int capacity;
	int front, rear, cur_size;
	int[] queue;

	public QueueImplementation2(int cap) {
		capacity = cap;
		front = 0;
		cur_size = 0;
		rear = capacity - 1;
		queue = new int[capacity];
	}

	public boolean isFull() {
		if (cur_size == capacity)
			System.out.println("Overflow, cannot eenqueue");
		return cur_size == capacity;
	}

	public boolean isEmpty() {
		if (cur_size == 0)
			System.out.println("Underflow, cannot dequeue");
		return cur_size == 0;

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
		rear = (rear + 1) % capacity;
		queue[rear] = element;
		cur_size++;
		System.out.println(element + " enqueued successfully");
	}

	public int dequeue() {
		if (isEmpty())
			return Integer.MAX_VALUE;
		int removedElement = queue[front];
		front = (front + 1) % capacity;
		cur_size--;
		return removedElement;
	}

	public void display() {
		if (isEmpty())
			return;
		for (int i = front, j = 0; j < cur_size; j++) {
			System.out.println(queue[(i + j) % capacity]);
		}
	}

}
