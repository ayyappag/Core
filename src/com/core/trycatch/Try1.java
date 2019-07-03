package com.core.trycatch;

import java.io.File;
import java.io.IOException;

public class Try1 {

	static int k;

	// Static with final : The blank final field k may not have been initialized
	public static void main(String[] args) {
		String a = "t";

		k = 9;
		System.out.println("K value is :" + k);
		m1();
		System.out.println("after m1");

	}

	public static boolean m1() {

		try {
			System.out.println("dfsf");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	throw e;
		} finally {
			System.out.println("finally");
		}
		return true;

	}

}
