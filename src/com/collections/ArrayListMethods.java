package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		arrayListExample();

	}

	public static void arrayListExample() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add(1, "InsertedData");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
		System.out.println("*********Converting Arraylist to Array*********");
		Object[] objArray = al.toArray();
		System.out
				.println("ArrayList elements are copied into an Array. Now Array Contains..");
		for (int i = 0; i < objArray.length; i++) {
			System.out.println("converted data from array" + objArray[i]);
			System.out.println("-This is from arraylist ::::::::::::"
					+ al.get(i));
		}

		System.out.println("*********SubList example *********");
		List subList = al.subList(0, 2);
		for (int i = 0; i < subList.size(); i++) {
			System.out.println("sublist example -- " + subList.get(i));
		}

		System.out
				.println("************get an Iterator object for ArrayList using iterator() method.*******");
		// get an Iterator object for ArrayList using iterator() method.
		Iterator<String> itr = al.iterator();
		while (itr.hasNext())
			System.out.println("" + itr.next());

		System.out.println("***Example for List Iterator****");

		/*
		 * Get a ListIterator object for ArrayList using listIterator() method.
		 */
		ListIterator<String> listItr = al.listIterator();//[one, InsertedData, two, three]

		/*
		 * Use hasNext() and next() methods of ListIterator to iterate through
		 * the elements in forward direction.
		 */

		while (listItr.hasNext())
			System.out.println("Next:>"+listItr.next());

		/*
		 * Use hasPrevious() and previous() methods of ListIterator to iterate
		 * through the elements in backward direction.
		 */

		while (listItr.hasPrevious())//[one, InsertedData, two, three]
			System.out.println("Previous:>"+listItr.previous());

		System.out.println("*********Adding Vector To ArrayList*********");
		Vector<String> v = new Vector<String>();
		v.add("4");
		v.add("5");
		// insert all elements of Vector to ArrayList at index 1
		// al.addAll(1,v);
		al.addAll(v);
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Vector >>> After ::::::::::::-" + al.get(i));
		}

		// create an ArrayList object
		ArrayList searchList = new ArrayList();

		// Add elements to Arraylist
		searchList.add("1");
		searchList.add("2");
		searchList.add("3");
		searchList.add("4");
		searchList.add("5");
		searchList.add("1");
		searchList.add("2");
		System.out
				.println("*** Example for contains, index , lastindex methods of List ***********");
		/*
		 * To check whether the specified element exists in Java ArrayList use
		 * boolean contains(Object element) method. It returns true if the
		 * ArrayList contains the specified objct, false otherwise.
		 */

		boolean blnFound = searchList.contains("2");
		System.out.println("Does arrayList contain 2 ? " + blnFound);

		/*
		 * To get an index of specified element in ArrayList use int
		 * indexOf(Object element) method. This method returns the index of the
		 * specified element in ArrayList. It returns -1 if not found.
		 */

		int index = searchList.indexOf("4");
		if (index == -1)
			System.out.println("ArrayList does not contain 4");
		else
			System.out.println("ArrayList contains 4 at index :" + index);

		/*
		 * To get last index of specified element in ArrayList use int
		 * lastIndexOf(Object element) method. This method returns index of the
		 * last occurrence of the specified element in ArrayList. It returns -1
		 * if not found.
		 */

		int lastIndex = searchList.lastIndexOf("1");
		if (lastIndex == -1)
			System.out.println("ArrayList does not contain 1");
		else
			System.out
					.println("Last occurrence of 1 in ArrayList is at index :"
							+ lastIndex);

		System.out.println("*****ArrayList Sorting Example******");
		/*
		 * To sort an ArrayList object, use Collection.sort method. This is a
		 * static method. It sorts an ArrayList object's elements into ascending
		 * order.
		 */
		Collections.sort(searchList);

		// display elements of ArrayList
		System.out
				.println("ArrayList elements after sorting in ascending order : ");
		for (int i = 0; i < searchList.size(); i++)
			System.out.println(searchList.get(i));

		/*
		 * To remove an element from the specified index of ArrayList use Object
		 * remove(int index) method. It returns the element that was removed
		 * from the ArrayList.
		 */
		Object obj = al.remove(1);
		System.out.println(obj + " is removed from ArrayList");
		/*
		 * To remove all elements from the ArrayList use void clear() method.
		 */
		System.out
				.println("**** To remove all elements from the ArrayList use void clear() method*****");
		al.clear();
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(1);

	}

}
