package com.bridgelabz.datastructures;

public class TestQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.insert(56);
		queue.insert(30);
		queue.insert(70);
		queue.display();
		queue.peak();
		queue.pop();
		queue.display();
		queue.pop();
		queue.display();
		queue.pop();
		queue.pop();
	}
}