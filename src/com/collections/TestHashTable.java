package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashTable {
	public static void main(String[] args) {
		//create Hashtable object
	    Hashtable<String, String> ht = new Hashtable<String, String>();
	   
	    //add key value pairs to Hashtable
	    ht.put("1","One");
	    ht.put("2","Two");
	    ht.put("3","Three");
	    
	    System.out.println("contains --  " + ht.containsKey("1"));
	    System.out.println("hashmap contains key or not "
				+ ht.containsKey("1"));
		System.out.println("hashmap contains value or not "
				+ ht.containsKey("Three"));
		System.out.println("hashmap contains value or not "
				+ ht.containsValue("Three"));
		System.out.println("hashmap size --- " + ht.size());
		System.out.println("remove individual value from the hashmap -- "
				+ ht.remove("1"));
		ht.put("5", "testdata");
		
		getKeys(ht);
		getValues(ht);
		getKeyValues(ht);
		removeMap(ht);
	   
	}
	public static void getKeys(Hashtable<String, String> hashTable) {
		/*
		 * get Set of keys contained in HashMap using Set keySet() method of
		 * HashMap class
		 */
		Set<String> set = hashTable.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("getKeys data === " + itr.next());
		}
	}

	public static void getValues(Hashtable<String, String> hashTable) {
		/*
		 * get Collection of values contained in HashMap using Collection
		 * values() method of HashMap class
		 */
		Collection<String> c = hashTable.values();

		// obtain an Iterator for Collection
		Iterator<String> itr = c.iterator();

		while (itr.hasNext()) {
			System.out.println("getValues data === " + itr.next());
		}
	}

	public static void getKeyValues(Hashtable<String, String> hashTable) {
		
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
		}
	}

	public static void removeMap(Hashtable<String, String> hashTable) {
		hashTable.clear();
		System.out.println("clear the all the data from the map" + hashTable);
	}
}
