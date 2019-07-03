package com.core.util;

public class EqualsTest {

	public static void main(String[] args) {
		EqualsTest e1 = new EqualsTest();
		EqualsTest e2 = new EqualsTest();
		System.out.println("e1 and e2 > " + e1.equals(e2));
		Integer i = 5;
		Integer j = 5;
		System.out.println("e1 and e2 > " + i.equals(j));
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("in equals method");
		if ((obj instanceof EqualsTest))
			return true;
		// return super.equals(obj);
		else
			return false;
	}

}
