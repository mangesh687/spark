package com.classdetail.model;

import java.util.Scanner;

public class IfelseifMark {

	public static void main(String[] args) {
		System.out.println("enter your marks");
 Scanner sc=new Scanner(System.in);
 int marks=sc.nextInt();
 if(marks >=75) {
	 System.out.println("First class");
 }
 else if(marks >=60 && marks <75)

	{
	 System.out.println("Second class");
	}
 else if(marks>=55 && marks <60) {
	 System.out.println("third class ");
 }
 else if(marks>35 && marks<55) {
	 System.out.println("forth class");
 }
 else {
	 System.out.println("fail");
 }
	}

}
