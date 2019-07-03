package com.core.access;

public class AbstractImpl extends A2 {
	
	public static void main(String[] args) {
		A2 a = new AbstractImpl();
		a.absTest1();
	}

	@Override
	public void absTest2() {
		// TODO Auto-generated method stub
		
	}
	
	// Check below code with comment and without comment
	@Override
	public void absTest1() {
		// TODO Auto-generated method stub
		System.out.println("AbstractImpl implementation");
	}
}
