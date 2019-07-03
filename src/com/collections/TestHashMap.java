package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create HashMap object
		HashMap<String, String> hMap = new HashMap<String, String>();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");
		System.out.println("hashmap contains key or not "
				+ hMap.containsKey("1"));
		System.out.println("hashmap contains value or not "
				+ hMap.containsKey("Three"));
		System.out.println("hashmap contains value or not "
				+ hMap.containsValue("Three"));
		System.out.println("hashmap size --- " + hMap.size());
		System.out.println("remove individual value from the hashmap -- "
				+ hMap.remove("1"));
		hMap.put("5", "testdata");

		getKeys(hMap);
		getValues(hMap);
		getKeyValues(hMap);
		removeMap(hMap);
	}

	public static void getKeys(HashMap<String, String> map) {
		/*
		 * get Set of keys contained in HashMap using Set keySet() method of
		 * HashMap class
		 */
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("getKeys data === " + itr.next());
		}
		map.clear();
	}

	public static void getValues(HashMap<String, String> map) {
		/*
		 * get Collection of values contained in HashMap using Collection
		 * values() method of HashMap class
		 */
		Collection<String> c = map.values();

		// obtain an Iterator for Collection
		Iterator<String> itr = c.iterator();

		while (itr.hasNext()) {
			System.out.println("getValues data === " + itr.next());
		}
		map.put("10", "10");
	}

	public static void getKeyValues(HashMap<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
		}
	}

	public static void removeMap(HashMap<String, String> map) {
		map.clear();
		System.out.println("clear the all the data from the map" + map);
	}
}
