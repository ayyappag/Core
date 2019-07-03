package com.core.finalEx;

public class Vararg {

	public static void main(String[] args) {
		// wide_Vararg(5, 5);
	}

	static void wide_Vararg(long... x) {
		System.out.println("long"+void.class);
	}

	static void wide_Vararg(Integer... x) {
		System.out.println("Integer");
	}

}
