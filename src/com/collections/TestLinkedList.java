package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create LinkedList object
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		addElements(linkedList);
		searchValue(linkedList);
		/*convertionArray(linkedList);
		iterateList(linkedList);
		removeRangeList(linkedList);
		clearList(linkedList);*/

	}

	public static void addElements(LinkedList<Integer> list) {
		LinkedList<Integer> listClone = (LinkedList<Integer>) list.clone();
		System.out.println(list.hashCode()+"= object reference check== "+listClone.hashCode());
		list.add(6);
		System.out.println("after adding --- " + list);
		System.out.println("clone object " + listClone);
		list.addFirst(2);	
		System.out.println("addFirst method -- " + list);
		list.addLast(7);
		System.out.println("addLast method -- " + list);
		System.out.println("contains method -- " + list.contains(3));
		System.out.println("subList example -- " + list.subList(0, 3));
		System.out.println("get First Element " + list.getFirst());
		System.out.println("get last element -- " + list.getLast());
		list.add(5, 90);
		System.out
				.println("after adding the element with specified index ---- "
						+ list);
		System.out
				.println("replace the element using the replace() for particular position or index === (this method returns the index value ) --- "
						+ list.set(3, 78));
		System.out.println("after replace method --- " + list);
		System.out.println("clone object " + listClone);
		System.out.println(list.hashCode()+"=== "+listClone.hashCode());
	}

	public static void convertionArray(LinkedList<Integer> list) {
		/*
		 * To create an Object array from elements of Java LinkedList, use
		 * Object[] toArray() method.
		 * 
		 * This method returns an array of Objects containing the elements of
		 * Java LinkedList in correct order.
		 */

		Object[] objArray = list.toArray();
		System.out.println("Object array created from Java LinkedList.");
		System.out.println("Object array contains : ");

		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i]);
		}
	}

	public static void iterateList(LinkedList<Integer> list) {
		/*
		 * To get an Iterator object of LinkedList, use Iterator iterator()
		 * method.
		 */

		Iterator<Integer> itr = list.iterator();

		System.out.println("Iterating through elements of Java LinkedList...");
		System.out.println("LinkedList contains : ");
		while (itr.hasNext()) {
			System.out.print(",");
			System.out.print(itr.next());
		}

		/*
		 * To get an ListIterator object of LinkedList, use ListIterator
		 * listIterator() method.
		 */

		ListIterator<Integer> listitr = list.listIterator();

		System.out
				.println("Iterating through elements of Java LinkedList using ListIterator in forward direction...");
		while (listitr.hasNext()) {
			System.out.print(listitr.next());

		}
		System.out.println();
		System.out
				.println("Iterating through elements of Java LinkedList using	ListIterator in reverse direction...");
		while (listitr.hasPrevious())
			System.out.print(listitr.previous());

		System.out.println("List " + list + "-- from remove first element --- "
				+ list.removeFirst());
		System.out.println("List " + list + "-- from remove last element --- "
				+ list.removeLast());

	}

	public static void removeRangeList(LinkedList<Integer> list) {
		System.out.println("remove list of values from the below list === "
				+ list);
		list.subList(0, 3).clear();
		System.out
				.println("after remove list of values from the below list === "
						+ list);
		System.out
				.println("based on the value , we can remove the value using remove method -- "
						+ list.remove()); // it will remove the first element by
		// default
		// System.out.println("based on the value " + list.remove(4));
	}

	public static void clearList(LinkedList<Integer> list) {

		System.out.println("list contains 3 " + list.contains(3));
		System.out.println("before clear the data from list --- " + list);
		System.out.println("remove the elements ---- using clear() method  ");
		list.clear();
		System.out.println("after clearing the data from list -- " + list);
		System.out.println("after removing the data from list === " + list);
	}

	public static void searchValue(LinkedList<Integer> lList) {
		/*
		 * To search first occurrence of an element of LinkedList, use int
		 * indexOf (Object element) method.
		 * 
		 * This method returns index of first occurrence of element if found in
		 * the LinkedList. It returns -1 if element not found.
		 */

		int index = lList.indexOf(2);
		if (index != -1) {
			System.out
					.println("First occurrence of 2 in LinkedList is at index : "
							+ index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}

		/*
		 * To search last occurrence of an element of LinkedList, use int
		 * lastIndexOf(Object element) method.
		 * 
		 * This method returns index of last occurrence of element if found in
		 * the LinkedList. It returns -1 if element not found.
		 */

		index = lList.lastIndexOf(2);
		if (index != -1) {
			System.out
					.println("Last occurrence of 2 in LinkedList is at index : "
							+ index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}
	}
}