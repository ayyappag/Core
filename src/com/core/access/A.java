package com.core.access;

import com.core.access1.B;
import com.core.access1.ProtectA;

public class A {

	/**
	 * @param args
	 */

	protected static int i = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.getName());
		ProtectA protectA = new ProtectA();
		protectA.m1();
		// protectA.m2(); Not Visible
	}

}
