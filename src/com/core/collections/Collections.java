package com.core.collections;

import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		createListOfNCopiesExample();
	}

	public static void createListOfNCopiesExample() {
		/*
		 * To create a List containing n copies of specified Object use, static
		 * List nCopies(int n, Object obj) method of Java Collections class.
		 * 
		 * This method returns immutable List containing n copies of the
		 * specified Object.
		 */

		A a = new A();
		A a1 = new A();
		
		List list = java.util.Collections.nCopies(5, a);
		// iterate through newly created list
		System.out.println("List contains, ");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Copy details :" + itr.next());
			/*a1 = (A) itr.next();
			a1.setName("a");*/
		}
		System.out.println("as" + a1.getName());
	}

}
