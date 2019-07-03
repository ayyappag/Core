package com.core.access;

public class SwitchTest {

	static int x;
	int g = 'c';

	public static void main(String... ki) {
		String a = "2";
		int x = 1;
		int y = 1;

		for (int k = 5; x < k; k--) {
			System.out.print(k);

		}
		
		System.out.println("prefix="+ (++x));
		System.out.println("suffix="+ (y++));

		for (int k = 5; y < k; --k) {
			System.out.println(k);

		}
		switch (Integer.parseInt(a)) {
		case 1:
			System.out.println("1");
			break;

		default:
			System.out.println("123");
			break;
			
		case 2:
			System.out.println("case 2");
			break;
		
		}

	}

	public static void main(int[] i) {
		System.out.println("int");
	}

	public static void main(String[][] i) {
		System.out.println("double");

	}
}
