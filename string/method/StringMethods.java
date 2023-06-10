package com.string.method;

public class StringMethods {

	public static void main(String[] args) {
		String  a="ANKIT";
	String b="rahul";
    System.out.println(a.toLowerCase());// ankit
    System.out.println(b.toUpperCase());//RAHUL
    System.out.println(b.concat(a));//ankitRAHUL join to string 
    System.out.println(b.length());//5
    
    String c="    Mangesh    ";
    String d="";
    System.out.println(c.trim());//Mangesh
    System.out.println(d.isEmpty());//True
    System.out.println(b.charAt(3));//h
    System.out.println(a.indexOf("K"));//2
    System.out.println(b.equals(a));//false
    System.out.println(b.replace('r', 'h'));//hahul
    

	}

}
