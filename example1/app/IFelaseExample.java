package com.example1.app;

import java.util.Scanner;

public class IFelaseExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		int age=sc.nextInt();
		//String st=sc.next();
		//System.out.println(st);
		System.out.println("enter the auldt age ");
		if(age>18) {
			System.out.println("student is adult");
		}
		else {
			System.out.println("student is not adult");
		}
		

	}

}
