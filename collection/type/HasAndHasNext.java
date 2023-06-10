package com.collection.type;

public class HasAndHasNext {

	public static void main(String[] args) {
      String str="any name";
      String rev=" ";
      int strLength=str.length();
      for(int i=(strLength-1);i>=0;i--) {
    	  rev=rev+str.charAt(i);
      }
      if(str.toLowerCase().equals(rev.toLowerCase())) {
    	  System.out.println(str+"string is palindrome");
      }
      else {
    	  System.out.println(str+"string is not palindrome");
      }
      }
	}

