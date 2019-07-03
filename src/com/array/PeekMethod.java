package com.array;

import java.util.Collections;
import java.util.LinkedList;

public class PeekMethod {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("cb");
		list.add("bf");

		System.out
				.println("if we dont have any data in list, it will through java.util.NoSuchElementException for getFirst and element methods");

		System.out.println("First:1>" + list.getFirst()); // java.util.NoSuchElementException
		System.out.println("First:2>" + list.element()); // java.util.NoSuchElementException
		System.out.println("First:3>" + list.peek()); // its shows null for
														// emptylist
		System.out.println("First4>" + list.peekFirst()); // its shows null for
															// emptylist
		list.descendingIterator();

		Collections.sort(list);
	}
}
