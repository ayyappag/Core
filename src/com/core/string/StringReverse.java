package com.core.string;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) {
		String string = "imgood";
		char[] c = string.toCharArray();
		int left, right = 0;
		right = c.length - 1;
		for (left = 0; left < right; left++, right--) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
		}
		for (char a : c) {
			System.out.print(a);
		}

		System.out.println(c);

		System.out.println("method 2");

		String test = "technical one";
		char[] k = test.toCharArray();

		/*
		 * for(int i=0,j=k.length-1;i<j/2;i++){ k[i] = k[j]; }
		 * System.out.println("ttet::::"); for(char ke: k){
		 * System.out.print(ke);
		 * 
		 * }
		 */

		System.out.println();
		List<Character> list = new LinkedList();
		for (char temp : k) {
			list.add(temp);
		}
		Collections.reverse(list);
		System.out.println(list);
		for (char ke : list) {
			System.out.print(ke);

		}
		System.out.println();
		ListIterator li = list.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}

		System.out.println("");
		System.out.println(reverseString(test));

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
