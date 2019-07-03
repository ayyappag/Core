package com.core.stati;

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
		p.m2();

		Child c = new Child();
		c.m1();
		Child.m2();
		c.m3();
	}
}
