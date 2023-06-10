package com.Arrey.model;

import java.util.Scanner;

public class Arrayinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enther the no. size of arrey ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elelment ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		

	}

}
