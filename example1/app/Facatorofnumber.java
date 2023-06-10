package com.example1.app;

import java.util.Scanner;

public class Facatorofnumber {

	public static void main(String[] args) {
		System.out.println("enther the number of facator");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("facator of product"+fact);

	}

}
