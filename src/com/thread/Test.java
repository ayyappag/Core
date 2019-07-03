package com.thread;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner tes = new Scanner(System.in);
		System.out.println(" Enter the values : : ");
		int i = tes.nextInt();
		int y = tes.nextInt();
		System.out.println(" k = " +i+ " ;;; l = " +y);
		swap(i, y);
		swap();

	}

	public static void swap(int i, int j) {
		int c = i;
		i = j;
		j = c;
		System.out.println("i ==" + i + "j== " + j);

	}

	public static void swap() {
		String a = "abc";
		String b = "xyz";
		int i = a.length();
		int j = b.length();
		a = a.concat(b);
		b = a.substring(0, i);
		a = a.substring(i, i + j);
		System.out.println("a== " + a + "::  b ==" + b);
		String nulltest = "";
		System.out.println(" test " + nulltest.length());

	}

}
