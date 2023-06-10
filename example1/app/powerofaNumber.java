package com.example1.app;

import java.util.Scanner;

public class powerofaNumber {

	public static void main(String[] args) {
		System.out.println("enther the number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int result=1;
	System.out.println("enther power of number ");
	int p=sc.nextInt();
	for(int i=1;i<=p;i++) {
		result=n*result;
	
	}
System.out.println("final result  "+result);
	}

}
