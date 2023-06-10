package com.example1.app;

import java.util.Scanner;

public class VovalPresentOrNotCheck {

	public static void main(String[] args) {
     System.out.println("enter the sentance ");
     Scanner sc=new Scanner(System.in);
     String name=sc.next();
     for(int i=0;i<name.length();i++) {
    	 char ch=name.charAt(i);
    	 if(ch =='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u' )
    	 {
    		 System.out.println("voval are found");
    	 }
    	 
     }
	}

}
