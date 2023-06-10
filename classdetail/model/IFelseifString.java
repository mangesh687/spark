package com.classdetail.model;

import java.util.Scanner;

public class IFelseifString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your number");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter opration Multi add sub div");
Scanner sc2=new Scanner(System.in);
String oper=sc2.nextLine();
if(oper.equalsIgnoreCase("Add")) {
	System.out.println(a+b);
}
else if(oper.equalsIgnoreCase("sub"))
{
	System.out.println(a-b);
}
else if(oper.equalsIgnoreCase("multi"))
{
	System.out.println(a*b);
}
else if(oper.equalsIgnoreCase("div"))
{
	System.out.println(a/b);
}
else {
	System.out.println("please enter correct result");
}
	}

}
