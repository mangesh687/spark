package com.interview.com;

import java.util.HashMap;

public class CheckNo {

	public static void main(String[] args) {
		
	 
		

			      String str = "any name ";
			      HashMap <Character, Integer> name = new HashMap<>();
			      for (int i = str.length() - 1; i >= 0; i--) {
			         if (name.containsKey(str.charAt(i))) {
			            int count = name.get(str.charAt(i));
			            name.put(str.charAt(i), ++count);
			         } else {
			            name.put(str.charAt(i),1);
			         }
			      }
			      System.out.println(name);
			   }
			

	}


