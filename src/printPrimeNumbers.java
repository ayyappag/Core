public class printPrimeNumbers {
	public static void main(String[] args) {
		int count = 1;
		int number = 2;
		boolean isPrime = true;

		System.out.println("The prime numbers from 2 to 1000 are \n");

		int oldint=0;
		while (number <= 1000) {
			isPrime = true;

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				// System.out.println("number % divisor == " + (number %
				// divisor));
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				//System.out.println("" + count % 8);
				if (count % 8 == 0) {
					System.out.println(number);
				} else {
					System.out.println(number + " ");
				}
				count++;
			}

			number++;
		}
		System.out.println("count :"+count);
		System.out.println("new method :");
		
		int testj=0;
		for (int k = 2; k <= number; k++) {
			// print prime numbers only
			if (isPrime(k)) {
				System.out.println(k);
				testj++;
			}
		}
		System.out.println();
		System.out.println("no of values :testj> "+testj);
		
	
	}

	/*
	 * Prime number is not divisible by any number other than 1 and itself
	 * 
	 * @return true if number is prime
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // number is divisible so its not prime
			}
		}
		return true; // number is prime now
	}
}
