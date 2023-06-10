package com.example1.app;

import java.util.Scanner;

public class PrintMultipicationTable {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the multipication table ");
int tablenumber=sc.nextInt();
for(int i=1;i<=10;i++) {
	System.out.println(i+"*"+tablenumber+"="+i*tablenumber);
}
	}

}
