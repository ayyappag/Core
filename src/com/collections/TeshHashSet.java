package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TeshHashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>(10);
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		list.add("a");
		list.add("r");
		list.add("ay");
		list.add("c4");
		list.add("d4");
		list.add("c");
		//list.add("b");
		System.out.println("List"+list);

		System.out.println("set>>>>" + set);
		System.out.println("set size---" + set.size());
		System.out.println("" + set.contains("a"));
		System.out.println("" + set.isEmpty());
		System.out.println("" + set.toArray());
		/*
		 * public Object[] toArray() Returns an array containing all of the
		 * elements in this collection. If this collection makes any guarantees
		 * as to what order its elements are returned by its iterator, this
		 * method must return the elements in the same order. The returned array
		 * will be "safe" in that no references to it are maintained by this
		 * collection. (In other words, this method must allocate a new array
		 * even if this collection is backed by an array). The caller is thus
		 * free to modify the returned array.
		 * 
		 * This method acts as bridge between array-based and collection-based
		 * APIs.
		 * 
		 * This implementation returns an array containing all the elements
		 * returned by this collection's iterator, in the same order, stored in
		 * consecutive elements of the array, starting with index 0. The length
		 * of the returned array is equal to the number of elements returned by
		 * the iterator, even if the size of this collection changes during
		 * iteration, as might happen if the collection permits concurrent
		 * modification during iteration. The size method is called only as an
		 * optimization hint; the correct result is returned even if the
		 * iterator returns a different number of elements.
		 * 
		 * This method is equivalent to:
		 * 
		 * List<E> list = new ArrayList<E>(size()); for (E e : this)
		 * list.add(e); return list.toArray();
		 * 
		 * 
		 * Specified by: toArray in interface Collection<E> Returns: an array
		 * containing all of the elements in this collection
		 */

		System.out.println("synch--" + Collections.synchronizedSet(set));

		Iterator<String> itr = set.iterator();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("---for loop--" + string);

		}
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("---while lopp--" + string);
		}
	
		System.out.println("remove --- " + set.remove("a"));
		System.out.println("-after remove--"+set);
		System.out.println("retainsAll--- "+ set.retainAll(list));
		System.out.println("-after retainsAll set--"+set);
		removeElementList(list);
		
		
	}
	
	public  static void removeElementList(ArrayList<String> list){
		System.out.println("---before deleting the data -- " +list);
		
		int index = Collections.binarySearch(list, "c");
		System.out.println("index :: " +index);
		System.out.println(list);
		list.remove(index);
		System.out.println(list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("removeelement---"+string);
			if(string =="b")
			{
				iterator.remove();
				break;
			}
			
		}
		
		
		
		System.out.println(""+list);
	}

}
