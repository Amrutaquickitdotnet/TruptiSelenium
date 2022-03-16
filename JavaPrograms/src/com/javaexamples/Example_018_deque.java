package com.javaexamples;



import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;


public class Example_018_deque {

	public static void main(String[] args) {
		Queue<Integer>q = new LinkedBlockingDeque();
		q.add(24);//head of queue
		q.add(22);
		q.add(25);
		q.add(26);
		System.out.println(q.remove(25));
		System.out.println(q);
		System.out.println(q.peek());
		
}
}
