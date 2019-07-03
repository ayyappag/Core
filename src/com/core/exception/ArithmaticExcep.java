package com.core.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArithmaticExcep {

	public ArithmaticExcep() {

	}

	public static void main(String[] args) {
		int i = 2;
		int j = 0;

		List<String> l = new ArrayList<String>();

		l.add("a");
		l.add("b");
		l.add("a");
		l.add("c");
		l.add("a");
		l.add("b");

		Set<String> s = new HashSet<String>(l);
		
		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string + ":=>"
					+ Collections.frequency(l, string));
		}

		for(String o:l){
			System.out.print(o);
		}
		
		Collections.reverse(l);
		System.out.println();
		for(String o:l){
			System.out.print(o);
		}
		
		System.out.println();
		for(int ik =0,jk=l.size()-1;ik<jk;ik++){
			l.add(ik, l.remove(jk));
		}
		
		for(String o:l){
			System.out.print(o);
		}
		
		int a[] = {1, 2, 3, 3};
		int[] b= new int[a.length];
		
		for(int i1 =0,j1=b.length-1;i1<a.length;i1++,j1--){
			b[i1] = a[j1];
		}
		
		
		
		try {
			if (i / j > 1)
				System.out.println("df");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("artith");
			e.printStackTrace();
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("overall");
		} finally {
			System.out.println("finally block");
		}
	}

}
