package com.core.access1;

public class ProtectA {

	protected int i = 5;

	public void m1() {
		System.out.println("void m1");
	}

	protected void m2() {
		System.out.println("void protected m2");
	}
	
	protected void m1(final int i) {
		System.out.println("void protected m1");
		System.out.println("final i="+i);
		int valAssign = 10;
		// i= valAssign; //The final local variable i cannot be assigned.
		// It must be blank and not using a compound assignment
	}

}
