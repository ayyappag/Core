package com.core.access;

public class TEST {

	static int y ;
	static int x ;

	public static void main(String[] args) {
		TEST t = new TEST();
		float f = t.math(3);
		System.out.println(++x);
		System.out.println(y--);
		System.out.println(y);
		y--;
		y--;
		System.out.println(y);
		int i =3;
		do while(i>2)
			System.out.println("sdf");
			while (i<9);
	}

	static int math(final int y) {
//		y /= 2;// ( y = y/2;)
		return y;
	}
}
