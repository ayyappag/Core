package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {

	
	public static void main(String[] args) {
		String[] name={"g","l","a","m"};
		System.out.println("name before:");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
		Arrays.sort(name, new Comparator<String>(
				) {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						
						return o1.compareTo(o2);
					}
				});
		System.out.println();
		System.out.println("name after:");	
		for (String name1 : name) {
			System.out.print(name1);
		}
	}
}
