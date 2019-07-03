import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AB {
	static int i = 3010;
	static int j = 20;
	int u; // class level or instance variables no need to assign the value .
	private static Log logger = LogFactory.getLog(AB.class);

	static {
		System.out.println(" this is form static block X");
	}

	public static void staticMethod() {
		// TODO Auto-generated method stub
		System.out.println("static method");

	}

	public static void staticMethod1() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String tet = "vywza xyzab test";
		String test = "abcdefghijklmnopqrstuvwxyz";

		int count = tet.split(Pattern.quote(" "), -1).length - 1;

		System.out.println("df:" + count);
		StringBuffer sb = new StringBuffer();

		for (String split : tet.split(" ")) {
			// System.out.println(split);
			for (int i = 0; i < split.length(); i++) {

				int k = test.indexOf(split.charAt(i));
				// System.out.println(k);
				int val = k + split.length() - i - 1;
				if (val >= 26)
					val = val - 26;
				sb.append(test.charAt(val));

			}
			if (count > 0)
				sb.append(" ");

		}
		System.out.println(sb.toString());

	}

	public static void method() /* throws OwnException */{
		// TODO Auto-generated method stub
		int ss; // method level variables need to intialize the value AND STORE
				// IN THE STACK MEMORY
		System.out.println(" method");
		String a = "hihow";

		/*
		 * if (i > 1000) { throw new OwnException(); }
		 */
		try {
			int g = a.length();
			if (i > 1000)
				System.out.println("hi ***");
			System.out.println(" nu ll : : " + g);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		System.out.println(" after catch");
	}

	public static void main(String[] args) {
		// Logger log = Loggerfactory.getLogger(AB.class);
		Log logger = LogFactory.getLog(AB.class);

		System.out.println(" own exception stating ");

		logger.debug("tEST ");
		// method();
		staticMethod1();
	}
}
