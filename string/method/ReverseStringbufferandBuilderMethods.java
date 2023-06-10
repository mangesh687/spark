package com.string.method;

public class ReverseStringbufferandBuilderMethods {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("heoll world");
		System.out.println(a.reverse());
		
		StringBuilder b=new StringBuilder("MANGESH");
		System.out.println(b.reverse());
		
		//without StringBuffer and Stringbuilder 
 String name="mangesh";
 String empaty="";
 int l=name.length();
 for(int i=l;i>l;i--) {
	 empaty=name +name.charAt(i);
 }
 
 System.out.println(empaty);
 
	}

}
