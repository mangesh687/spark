package com.example1.app;

import java.util.Scanner;

public class SwapNumberWithOutusingThairdvariable {

	public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        a=a+b;//10+30=40
        b=a-b;//40-30=10
        a=a-b;//40-10=30
        System.out.println("print a value a"+a);
        System.out.println("print a value b"+b);
	}

}
