package com.collection.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<String>();
		name.add("ankit");
		name.add("sakshi");
		System.out.println(name);
		name.add(1, "mangesh");// update position
		System.out.println(name);
		name.remove(2);
		System.out.println(name);// delect position 
		name.set(0, "sakshi");// replace position
		System.out.println(name);
		name.get(1);// print only one elemnet 
		System.out.println(name.get(1));
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Akash");
		stringList.add("Shubham");
		stringList.add("Nilesh");
		stringList.add("Dhananjay");
	
		Iterator<String> itr = stringList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("===========================");
		stringList.remove(2);
		System.out.println("After removing....");

		Iterator<String> itr2 = stringList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("============================");
		System.out.println(stringList.get(2));
		System.out.println("============================");
		System.out.println(stringList.contains("Mangesh"));// true or false 
		System.out.println("============================");

		// reverse order- descending 
		System.out.println("sorting by reverse order....");
		Collections.sort(stringList,Collections.reverseOrder());
		
		Iterator<String> itr3 = stringList.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("============================");
	
		System.out.println("sorting by ascending order....");
        Collections.sort(stringList);
		
		Iterator<String> itr4 = stringList.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		}
		
		


		
	}


