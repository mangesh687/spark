package com.string.method;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String name = sc.next();
		String revname = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			revname = ch + revname;

		}
		System.out.println(revname);
	}

}
