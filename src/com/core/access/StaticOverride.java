package com.core.access;

public class StaticOverride extends StaticS{

	public StaticOverride() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	public static void main(String[] args) {
		 StaticOverride s = new StaticOverride();
		 s.test();
	}
	/*@Override
	public static void test1(){
		
	}
	Static Method can not override. Compile time error
	
	*/
}
