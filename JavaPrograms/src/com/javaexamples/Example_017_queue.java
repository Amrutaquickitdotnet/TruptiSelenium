package com.javaexamples;


import java.util.LinkedList;

import java.util.Queue;


public class Example_017_queue {

	public static void main(String[] args) {
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(24);
		q.add(22);
		q.add(25);
		q.add(26);
		
		/*
		 * for(int a:q) { System.out.println("Elements in queue"+ a); }
		 */
	//int removedele =	q.remove();
	//System.out.println(removedele);
		int head =q.peek();
		System.out.println(head);
}
}
