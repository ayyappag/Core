package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class TestLinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al	 = new ArrayList<Integer>();
		al.add(1);
		al.add(12);
		al.add(22);
		al.add(2);
		al.add(20);
		System.out.println("al- " +al);
		Collections.sort(al);
		System.out.println("al- "+al);
		
		Vector<Integer> v	 = new Vector<Integer>();
		v.add(1);
		v.add(12);
		v.add(22);
		v.add(2);
		v.add(20);
		System.out.println("v-" +v);
		Collections.sort(v);
		System.out.println("v-"+v);
		
	}

}
