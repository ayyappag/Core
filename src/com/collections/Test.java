package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		String p = "hello";
		char test = 'l';
		int k = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == test)
				k++;
		}
		System.out.println("===" + k);
		enumiration();
	}

	public static void enumiration() {
		// create a Vector object
		Vector<String> v = new Vector();

		// populate the Vector
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");
		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) {
			String string = (String) enu.nextElement();
			System.out.println("data - " + string);
		}
	}
}
