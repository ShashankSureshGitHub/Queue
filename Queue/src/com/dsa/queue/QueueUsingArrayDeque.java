package com.dsa.queue;

import java.util.ArrayDeque;

public class QueueUsingArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());

		for (Integer i : queue) {
			System.out.print(i + " ");
		}

	}

}
