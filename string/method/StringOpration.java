package com.string.method;

public class StringOpration {

	public static void main(String[] args) {
		String str ="Hello";
		String str2 = new String("hello");
		String  str3 ="hi";
		String str4 = new String("Hello");
		
		  System.out.println(str.concat(str2));
		  
		  if(str.equals(str2)) 
		  { System.out.println("hey they are equal"); 
		  }
		  else {
		  System.out.println("hey they are not equal");
		  }
		  
		  if(str.equalsIgnoreCase(str2)) 
		  { 
			  System.out.println("hey they are equal");
		  }
		  else { 
			  System.out.println("hey they are not equal"); }
		 
		
		//.equals() -> only checks content
		//  == checks content and memory reference
		if(str2 == str4) {
			System.out.println("hey they are  equal");
		}else {
			System.out.println("hey they are not equal");
		}
		
		
		System.out.println("length is"+str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.contains("H"));

		

	}

}
