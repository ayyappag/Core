package com.collections;

import java.util.*;

public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");
		arrayList.add("4");
		ArrayList<Integer> intList = new ArrayList();
		intList.add(145554);
		intList.add(1454);
		intList.add(14654);
		intList.add(14254);
		intList.add(1487854);
		Vector<String> v = new Vector();
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");
		// create a HashSet object
		HashSet hashSet = new HashSet();

		// Add elements to HashSet
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		copyArrayListToVector(arrayList, v);
		createArrayListFromEnumeration(v);
		createListOfNCopiesExample();
		findMinMaxValuesOfArrayList(intList);
		getEnumerationOverArrayList(intList);
		getEnumerationOverHashSet(hashSet);
		getSynchronizationCollection(intList, hashSet, v);
		unmodifiableCollection(intList);
		binarySearchArrayListExample(arrayList);
	}

	public static void copyArrayListToVector(ArrayList<String> al,
			Vector<String> v) {
		/*
		 * To copy elements of Java ArrayList to Java Vector use, static void
		 * copy(List dstList, List sourceList) method of Collections class.
		 * 
		 * This method copies all elements of source list to destination list.
		 * After copy index of the elements in both source and destination lists
		 * would be identical.
		 * 
		 * The destination list must be long enough to hold all copied elements.
		 * If it is longer than that, the rest of the destination list's elments
		 * would remain unaffected.
		 */

		System.out.println("Before copy, Vector Contains : " + v);
		System.out.println("Before copy, arraylist Contains : " + al);

		// copy all elements of ArrayList to Vector using copy method of
		// Collections class
		Collections.copy(v, al);

		/*
		 * Please note that, If Vector is not long enough to hold all elements
		 * of ArrayList, it throws IndexOutOfBoundsException.
		 */
		// same thing is applied arraylist also i.e. Vector replaced with List
		// same thing is applied vector also i.e. list replaced with vector
		System.out.println("After Copy, Vector Contains : " + v);

		System.out.println("After Copy, arraylist Contains : " + al);
		System.out.println("**************************");

	}

	public static void createArrayListFromEnumeration(Vector<String> v) {
		System.out.println("Vector contains : " + v);
		/*
		 * To create ArrayList from any Enumeration, use static ArrayList
		 * list(Enumeration e) method of Collections class.
		 * 
		 * This method returns the ArrayList containing the elements returned by
		 * specified Enumeration object in order they are returned.
		 */
		// Get Enumeration over Vector
		Enumeration<String> e = v.elements();
		// Create ArrayList from Enumeration of Vector
		ArrayList<String> aList = Collections.list(e);
		System.out.println("Enumeration: Arraylist contains : " + aList);
		System.out.println("List: Arraylist contains vvvvvvvvvvvvvv: " + v);
		List<String> al = new ArrayList<String>(v);
		System.out.println("List: Arraylist contains : " + al);
		Collections.unmodifiableList(v);
		System.out.println("List: Arraylist contains vvvvvvvvvvvvvv: " + v);

		List<String> unmodify = new ArrayList<String>();
		
		unmodify.add("a1");
		unmodify.add("a2");
		unmodify.add("a3");
		List l1 = (List) Collections.unmodifiableList(unmodify);
		System.out.println("original unmodifiable Collection>>" + l1);
		// l1.add("Test1"); : Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println("after unmodifiable Collection>>" + l1);

		Iterator it = l1.iterator();
		while (it.hasNext()) {
			System.out.println("it value" + it.next());
			// it.remove(); Exception in thread "main" java.lang.UnsupportedOperationException
		}
	}

	public static void createListOfNCopiesExample() {
		/*
		 * To create a List containing n copies of specified Object use, static
		 * List nCopies(int n, Object obj) method of Java Collections class.
		 * 
		 * This method returns immutable List containing n copies of the
		 * specified Object.
		 */

		List list = Collections.nCopies(5, "A");
		// iterate through newly created list
		System.out.println("List contains nCopies, ");
		Iterator itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static void findMinMaxValuesOfArrayList(ArrayList<Integer> intList) {
		/*
		 * To find minimum element of Java ArrayList use, static Object
		 * min(Collection c) method of Collections class. This method returns
		 * the minimum element of Java ArrayList according to its natural
		 * ordering.
		 */
		/*
		 * Same Method is applicable for Hashset hashSet.add(new
		 * Long("923740927")); hashSet.add(new Long("4298748382"));
		 */

		Object minobj = Collections.min(intList);
		System.out.println("Minimum Element of Java ArrayList is : " + minobj);
		Object maxObj = Collections.max(intList);
		System.out.println("Minimum Element of Java ArrayList is : " + maxObj);

	}

	public static void getEnumerationOverArrayList(ArrayList<Integer> intList) {
		/*
		 * Get Enumeration over Java ArrayList object using, static Enumeration
		 * enumeration(Collection c) method of Collections class. This method
		 * returns the enumeration object over the specified Collection.
		 */

		// get the Enumeration object
		Enumeration<Integer> e = Collections.enumeration(intList);

		// enumerate through the ArrayList elements
		System.out.println("Enumerating through Java ArrayList");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());

	}

	public static void getEnumerationOverHashSet(HashSet<Integer> hashSet) {
		/*
		 * Get Enumeration over Java ArrayList object using, static Enumeration
		 * enumeration(Collection c) method of Collections class. This method
		 * returns the enumeration object over the specified Collection.
		 */
		/* The same methods are applied for Java Vector also */

		// get the Enumeration object
		Enumeration<Integer> e = Collections.enumeration(hashSet);
		// enumerate through the ArrayList elements
		System.out.println("Enumerating through Java hashSet");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());

	}

	public static void getSynchronizationCollection(ArrayList<Integer> intList,
			HashSet<Integer> hashSet, Vector<String> v) {
		/*
		 * Java ArrayList is NOT synchronized. To get synchronized list from
		 * ArrayList use static void synchronizedList(List list) method of
		 * Collections class.
		 */

		List list = Collections.synchronizedList(intList);

		/*
		 * Use this list object to prevent any unsynchronized access to original
		 * ArrayList object.
		 */
		HashMap hashMap = new HashMap();
		/*
		 * Java HashMap is NOT synchronized. To get synchronized Map from
		 * HashMap use static void synchronizedMap(Map map) method of
		 * Collections class.
		 */
		Map map = Collections.synchronizedMap(hashMap);
		/*
		 * Use this map object to prevent any unsynchronized access to original
		 * HashMap object.
		 */
		// create TreeMap object
		TreeMap treeMap = new TreeMap();
		/*
		 * Java TreeMap is NOT synchronized. To get synchronized Map from
		 * TreeMap use static void synchronizedMap(Map map) method of
		 * Collections class.
		 */
		Map mapOne = Collections.synchronizedMap(treeMap);

		/*
		 * Use this map object to prevent any unsynchronized access to original
		 * TreeMap object.
		 */
	}

	public static void unmodifiableCollection(ArrayList<Integer> intList) {
		System.out.println("*******unmodifiableCollection******");
		Collection<Integer> immutableCol = Collections
				.unmodifiableCollection(intList);

		Iterator<Integer> iterator = immutableCol.iterator();
		// immutableCol.add(3);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void binarySearchArrayListExample(ArrayList<String> arrayList) {

		/*
		 * To Search an element of Java ArrayList using binary search algorithm
		 * use, static int binarySearch(List list, Object element) method of
		 * Collections class.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the ArrayList. Otherwise it returns (- (X) - 1) where X is the
		 * index where the the search value would be inserted. i.e. index of
		 * first element that is grater than the search value or
		 * ArrayList.size(), if all elements of an ArrayList are less than the
		 * search value.
		 * 
		 * Please note that the ArrayList MUST BE SORTED before it can be
		 * searched using binarySearch method.
		 */

		// First sort an ArrayList using sort method of Collections class
		Collections.sort(arrayList);
		System.out.println("binarySearchArrayListExample:Sorted ArrayList contains : " + arrayList);

		// search an element using binarySearch method of Collections class
		int index = Collections.binarySearch(arrayList, "4");
		System.out.println("binarySearchArrayListExample:Element found at (index is)  : " + index);
	}

}
