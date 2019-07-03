package coreconcepts;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		int i = 9;
		int j = 10;
		int k = i + j;
		String sessionFactory = null;
		System.out.println("data --- " + k);
		boolean dash = true;
		if (dash) {
			System.out.println("dash must be true");
		} else {
			System.out.println("dash must be false");
		}

		int session = 0;
		boolean test = false;
		session = (sessionFactory == null) ? 8 : 5;
		System.out.println("session value =="+session);
		
		test = (sessionFactory == null) ? true : false;
		System.out.println("test value == "+ test);
		
		/*
		 * while(dash){ System.out.println("in while "); }
		 */

	}

}
