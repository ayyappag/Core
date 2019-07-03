package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountListOccurances {
	public static void main(String[] args) {
		CountListOccurances test = new CountListOccurances();
		List<String> names = test.getListDefault();
		// the result to store the nameTimes matched in the list
		Map<String, Integer> result = new HashMap<String, Integer>();
		// the names which used to statistics
		//String[] order = { "James", "Bill", "Joe", "steve" };
		
		System.out.println("james:>"+Collections.frequency(names, "James"));
		Set<String> listtoset = new HashSet<String>(names);
		System.out.println(names+"---" + listtoset);
		
		for (String str : listtoset) {
			while (names.indexOf(str) != -1) {
				//we can use lastindexof
				if (result.containsKey(str)) {
					result.put(str, result.get(str) + 1);
				} else {
					result.put(str, 1);
				} // end if
				names.remove(names.indexOf(str));
			} // end while
		}
		System.out.println(result);
	}

	public List<String> getListDefault() {
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
