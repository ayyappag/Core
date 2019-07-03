package com.core.finalEx;

public class StringTest {
	
	public static void main(String[] args) {
		String a = "Test";
		String b =a;
		System.out.println("1:a>"+a+":b>"+b);
		a=a.concat("One");		
		System.out.println("2:a>"+a+":b>"+b);
	}

}
