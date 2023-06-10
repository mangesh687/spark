package com.collection.type;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> name=new PriorityQueue<>(); // FIFO (ticket example)
		name.offer(43);
		name.offer(55);
		name.offer(75);
		System.out.println(name);
		System.out.println(name.poll());// remove first element 
		System.out.println(name);
		System.out.println(name.peek()); // first elelmet 
		
	}

}
