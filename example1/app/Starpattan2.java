package com.example1.app;

//import java.util.Scanner;

public class Starpattan2 {

	public static void main(String[] args) {
		//System.out.println("enter the row of patten");
	//Scanner sc=new Scanner(System.in);
	//int n=sc.nextInt();
	for(int i=1;i<=5;i++) { //row
		for(int j=i;j<5;j++) { //space
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) { //*print 
			System.out.print("*");
		}
		System.out.println(); // next line 
	}
    }
    }
