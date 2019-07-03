import java.util.InputMismatchException;
import java.util.Scanner;

public class computeSalesTax {
	public static void main(String[] args) {

		/* Create a scanner object to get input from user */
		Scanner input = new Scanner(System.in);

		try {
			System.out.printf("Enter purchase amount (example : %4d ) == ",
					4435);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch bl12ock
			e.printStackTrace();
		}
		/* Store the purchase amount as a double */
		double purchaseAmount = input.nextDouble();
		/* calculate the tax here */
		double tax = purchaseAmount * 0.06;

		System.out.println("Sales tax is " + (int) (tax * 100) / 100.0);
	}

}
