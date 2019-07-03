package com.core.finalEx;

public class Widening extends Test{

	public static void main(String[] args) {
		
		System.out.println("************* we can extend class having main method also");
		int i = 6;
		Integer k = 0;
		m1(i);
		m1(k);
		
		Test t = new Test();
		t.main(null);
	}

	static void m1(Integer i) {
		System.out.println("Integer");
	}

	static void m1(long i) {
		System.out.println("Compiler always choosing widening overthan boxing");
		System.out.println("long");
	}
}
