package com.example1.app;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
     System.out.println("enter the name to revese ");
     Scanner sc=new Scanner(System.in);
     String name=sc.next();
     String rev="";
     for(int i=0;i<name.length();i++) {
    	 char ch=name.charAt(i);
    	 rev=ch+rev;
     }
     System.out.println(rev);
	}

}
