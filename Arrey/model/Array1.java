package com.Arrey.model;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
//int a[]= {10,20,40,55,66};
//System.out.println(a[3]);
//int a[]=new a[5];
  System.out.println("enter the size of array");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter the elelment ");
   for(int i=1;i<=n;i++) {
	   a[i]=sc.nextInt();	   
   }
   System.out.println("enther the element");
   for(int i=1;i<=n;i++) {
	   System.out.println(a[i]);
   }
	}

}
