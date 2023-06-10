package com.collection.type;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {

		Deque<Integer> name = new ArrayDeque<>();
		name.offer(45);
		name.offer(56);
		name.offer(75);
		name.offer(65);
		name.offerFirst(78);
		name.offerLast(12);
		System.out.println(name);
		System.out.println(name.poll());// remove first element 
		System.out.println(name);
		System.out.println(name.pollLast());
		System.out.println(name);
		System.out.println(name.peek());// feath deatil first element 
		System.out.println(name);
	}

}
