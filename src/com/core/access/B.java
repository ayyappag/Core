package com.core.access;

import com.core.access1.ProtectA;

public class B extends ProtectA{

	/**
	 * @param args
	 */

	protected static int i = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ProtectA protectA = new ProtectA();
		protectA.m1();
		B b = new B();
		b.m1();
		b.m2();
		b.m1(9);
		
		
	}
	
	@Override
	protected void m1(int i) {
		// TODO Auto-generated method stub
		super.m1(i);
		final int k=9;
		System.out.println("i value :"+i);
	}

}
