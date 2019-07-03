package com.core.concurrent.Executor;

public class ReverseStringExample {

	public static void main(String[] args) {
		String originalString = "TESTED"; // String to be reversed

		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reverseString(originalString));
	}

	public static String reverseString(String originalString) {
		char[] chr = originalString.toCharArray(); 
		char temp;

		for (int i = 0, j = originalString.length() - 1; i < (originalString
				.length() / 2); i++, j--) {
			temp = chr[i];
			chr[i] = chr[j];
			chr[j] = temp;
		}
		return new String(chr);
	}

}
