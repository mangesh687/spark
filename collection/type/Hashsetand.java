package com.collection.type;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashsetand {

	public static void main(String[] args) {
		// hashset 
		//duplicated  not allow
		// unorder print
		// capacity 16 
		//null allow
		
//		LinkedHashSet
		//order print 
		//duplicated not allow
		//null allow
		//capacity 16 
		// fister as compared to hashset 
		// double link 
		
		
		
      Set<String> name=new LinkedHashSet();
      name.add(null);
      name.add("amit");
      name.add("amit");
      name.add("roshan");
      name.add("jay");
      name.add("amol");
      name.add("nitin");
      Iterator<String> itr= name.iterator();
      while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}

	}

}
