package com.rays.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
public static void main(String[] args) {
	Queue q = new PriorityQueue();
	
	
	q.add(5);
	q.add(7);
	q.add(6);
	q.add(4);
	
	System.out.println(q);
}
}
