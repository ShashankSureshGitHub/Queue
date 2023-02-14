package com.dsa.queue;

import java.util.LinkedList;

public class QueueUsingLinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		System.out.println(queue.element());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.element());

		System.out.println(queue.contains(20));
		System.out.println(queue.contains(40));
		System.out.println(queue.element());

		for (Integer integer : queue) {
			System.out.print(integer + " ");
		}

		System.out.println();

		// The below will not throw exception but, will just return null
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

		// The below will throw exception
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.element());

	}

}
