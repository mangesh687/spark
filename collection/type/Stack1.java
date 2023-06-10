package com.collection.type;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
      Stack <String>Name=new Stack<String>(); // LIFO ( last in first out) 
      Name.push("Mangesh");
      Name.push("ROhit");
      Name.push("Sakshi");
      System.out.println(Name);
      Name.pop(); // remove last 
      System.out.println(Name);
      Name.push("Shubahm");
      Name.push("Akshay");
      Name.push("Nilesh");
      Name.push("Mahesh");
		
			
		System.out.println(Name.pop());
		System.out.println(Name.pop());
		System.out.println(Name.pop());
		System.out.println(Name.pop());
      
	}

}
