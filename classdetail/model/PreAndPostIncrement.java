package com.classdetail.model;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		System.out.println(a++);//postincrement
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		System.out.println(a&b);// 101 & 111 =101
		System.out.println(a| b); // 101 | 111= 111
	}

}
