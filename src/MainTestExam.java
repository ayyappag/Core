public class MainTestExam {

	/**
	 * @param args
	 */
	{
		System.out.println("with out static MainTestExam");
	}

	static {
		{
			System.out.println("with  static MainTestExam");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTestExam test = new MainTestExam();
		increment();
		equalCheck();

	}

	private static void increment() {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;

		System.out.println(" i value == " + (i++));
		System.out.println(" j value == " + (++j));

	}

	private static void equalCheck() {
		// TODO Auto-generated method stub

		String a = "a";
		String b = "a";

		String c = new String("a");
		String d = c; // new String("a");

		System.out.println("=(a == b)= " + (a == b));
		System.out.println(" (a.equals(b) .equals == " + (a.equals(b)));

		System.out.println("==  c == d ?????> " + (c == d)); // reason C Object and d
														// object are allocated
														// with different
														// hashcode new
														// String("a");
		System.out.println(" .equals == c.equals(d) " + (c.equals(d)));

		System.out.println("== c == a " + (c == a));
		System.out.println(" .equals == c.equals(a) " + (c.equals(a)));

	}
}
