package com.core.finalEx;

public class StaticLoading {

	private static int i = 10;

	static {
		System.out.println("Static block");
	}

	public StaticLoading() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}

	public StaticLoading(int i) {
		System.out.println("Overlaoded constructor" + i);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
	StaticLoading name = new StaticLoading(10);
	}
	
}
