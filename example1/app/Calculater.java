package com.example1.app;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		System.out.println("enter two number");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();int cal;
int n2=sc.nextInt();
System.out.println("enter the oppration 1) addtion 2)sub 3)mul 4)divi 5)remander");
int ch=sc.nextInt();
switch(ch) {
case 1:
	cal=n1+n2;
	System.out.println("sum of two no."+cal);
	break;
case 2:
	cal=n1-n2;
	System.out.println("sub of two no."+cal);
	break;
case 3:
	cal=n1*n2;
	System.out.println("mul of two no."+cal);
	break;
case 4:
	cal=n1/n2;
	System.out.println("div of div no."+cal);
	break;
case 5:
	cal=n1%n2;
	System.out.println("remainder of div no."+cal);
	break;
	}
}
	

}
