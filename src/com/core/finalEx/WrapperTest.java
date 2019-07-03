package com.core.finalEx;

public class WrapperTest extends Test{

	public static void main(String[] args) {
		Integer i = new Integer(10);
		int k = Integer.valueOf(i);
		long t = Integer.valueOf(i);
		System.out.println("k=" + k + ":T>" + t);

		Integer i2 = new Integer(10);
		int k2 = i2.intValue();
		long t2 = i2.longValue();
		System.out.println("k2=" + k2 + ":T2>" + t2);

		int parseInt = Integer.parseInt("90");
		System.out.println("parseInt>" + parseInt);
	}
	
	
	// Not able to override the methods
	
	public static void m1(){
		
	}
}
