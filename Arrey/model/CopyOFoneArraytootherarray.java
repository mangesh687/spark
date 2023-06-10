package com.Arrey.model;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOFoneArraytootherarray {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of arreys ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("data of 2nd arrays");
		int b[]=Arrays.copyOf(a, n);
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		
		

	}

}
