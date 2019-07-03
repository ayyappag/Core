import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class Tokenizer {

	/*
	 * Any way Volatile keyword in Java is used as an indicator to Java compiler
	 * and Thread that do not cache value of this variable and always read it
	 * from main memory. So if you want to share any variable in which read and
	 * write operation is atomic by implementation
	 */
	private static volatile int i = 10;

	public static void main(String[] args) throws IOException {

		i = i * 9;
		System.out.println(" == " + i);

		StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(
				"Mary had 1 little lamb..."));
		
		List<String> a = new ArrayList<>();
		a.add("a");
		a.add("a1");
		a.add("a2");
		
		
		Set<String> set = new HashSet<>(a);
		
		Map<String, String> v = new HashMap<>();
		
		System.out.println("fd:"+v.keySet());
	
		while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {

			if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
				System.out.println(tokenizer.sval);
			} else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
				System.out.println(tokenizer.nval);
			} else if (tokenizer.ttype == StreamTokenizer.TT_EOL) {
				System.out.println();
			}

		}
		ResourceBundle rb = ResourceBundle.getBundle("MyResources", Locale.US);
		String testValue = rb.getString("test"); // PASS KEY VALUE
		System.out.println("=== resource bundle == " + testValue);
		Enumeration<String> bundleKeys = rb.getKeys();
		while (bundleKeys.hasMoreElements()) {
			String key = (String) bundleKeys.nextElement();
			String value = rb.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}

		spiltMethod();

	}

	public static void spiltMethod() {
		String Str = new String("Welcome-to-Tutorialspoint.com");

		System.out.println("Return Value 1 :");
		for (String retval : Str.split("-", 2)) {
			System.out.println(retval);
		}
		System.out.println("");
		System.out.println("Return Value 2 :");
		for (String retval : Str.split("-", 3)) {
			System.out.println(retval);
		}
		System.out.println("");
		System.out.println("Return Value 3 :");
		for (String retval : Str.split("-", 0)) {
			System.out.println(retval);
		}
		System.out.println("");
		System.out.println("Return Value final :");
		for (String retval : Str.split("-")) {
			System.out.println(retval);
		}
	}
}
