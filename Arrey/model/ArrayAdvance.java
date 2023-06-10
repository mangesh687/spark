package com.Arrey.model;
import java.util.Scanner;
public class ArrayAdvance {

	public static void main(String[] args) {
	//int arr[]= {8,9,20,7};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elelment of arrey");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the elelment");
	for(int i=0;i<n;i++) {
  arr[i]=sc.nextInt();
	}
	for(int i:arr) {
		System.out.println(i);
	//	arr[0]=8;
//	arr[1]=9;
//	arr[2]=20;
//	arr[3]=7;
	//for(int a:arr) {
		//System.out.println(a);
	}	
	}

}
