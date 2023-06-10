package com.Arrey.model;


import java.util.Scanner;
import java.util.Arrays;

public class sortaray {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("sort arreys");
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
