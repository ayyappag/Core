package coreconcepts;

import java.io.*;
import java.util.*;

public class ScanConsoleApp {
	public static void main(String arg[]) {

		// Create a scanner to read from keyboard
		
		// It implement the Readable and Regex interfaces
		// Java.util.regex : we have two methods like matcher and patterns
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.printf("Input int (e.g. %4d): ", 3501);
			int int_val = scanner.nextInt();
			System.out.println(" You entered " + int_val + "\n");

			System.out.printf("Input float (e.g. %5.2f): ", 2.43);
			float float_val = scanner.nextFloat();
			System.out.println(" You entered " + float_val + "\n");

			System.out.printf("Input double (e.g. %6.3e): ", 4.943e15);
			double double_val = scanner.nextDouble();
			System.out.println(" You entered " + double_val + "\n");
			
			System.out.println(""+ scanner.next("test"));
			if(scanner.next("test").equals("test"))
				System.out.println("true");
			else
				System.out.println("false");
		} catch (InputMismatchException e) {
			System.out.println("Mismatch exception:" + e);
		}
	} 

}
