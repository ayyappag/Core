package com.core.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonElementsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int count = 0;
		int k = 8;
		for (int i = arr1.length; i > 0; i--) {
			count = count + i;
		}
		System.out.println("total value :" + count);
		
	// Primitive data type is not allowed in the List. Its looking Integer Object Level 
		// like Integer[] arr1 = {1,2,3,3,3};
		// List<Integer> list = Arrays.asList(arr1);
	
		/*for(int i:list){
			System.out.println("i="+i);
		}*/

		int[] ints = { 1, 2, 3, 5, 6 };
		List<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < ints.length; index++) {
			intList.add(ints[index]);
		}

		// in Java 8 you can do this
		/* its converting from primitive array to List
		 * int[] ints = {1,2,3}; List<Integer> list =
		 * IntStream.of(ints).boxed().collect(Collectors.toList());
		 */
//		Another workaround if you use apache commons-lang:
		int[] spam = new int[] { 1, 2, 3 };
		/*List<Integer> list =  Arrays.asList(ArrayUtils.toObject(spam));
		for(int i:list){
			System.out.println("i="+i);
		}*/
// 		list.add(5);
		List<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		  System.out.println("ArrayList items: "+intlist);
	}
}
