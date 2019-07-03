package com.core.access;

public class TestOn {

	public static void main(String[] args) {
		String a = " abcdcba ";
		int x = 2;
		a = a.trim();
		if (a.length() < 8) {
			x = a.indexOf('d', 4); // Open Declaration int java.lang.String.indexOf(int ch, int fromIndex)
			System.out.println("x="+x);
		}
		a.charAt(3);
		System.out.println(x);
	}
}
