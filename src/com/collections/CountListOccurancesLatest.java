package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CountListOccurancesLatest {

	public static void main(String[] args) {

		List<String> list = getListDefault();

		Set<String> set = new HashSet<String>(list);

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Occurances of " + string + " is :"
					+ java.util.Collections.frequency(list, string));
		}
	}

	public static List<String> getListDefault() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("James");
		namesList.add("Bill");
		namesList.add("Joe");
		namesList.add("Bill");
		namesList.add("James");
		namesList.add("Joe");
		namesList.add("James");
		namesList.add("Joe");
		namesList.add("steve");
		namesList.add("Joe");
		return namesList;
	}
}
