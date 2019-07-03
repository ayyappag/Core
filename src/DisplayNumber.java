import java.util.HashMap;
import java.util.Scanner;

/*
 Write a test program that prompts the user to enter a string and displays the number
 of letters in the string.*/
public class DisplayNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int i = 0;
		// i= input.nextInt();
		System.out.println(" String : " + s + " :: Integer :" + i);
		System.out.println("The number of letters is " + countLetters(s));
		
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		/*int a1 = 2147483648;
		System.out.println(a1);*/
		
	}

	public static HashMap<String, Integer> countLetters(String s) {
		int letterCount = 0;
		int digitCount = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				letterCount++;
			}
			if (Character.isDigit(s.charAt(i))) {
				digitCount++;
			}
		}
		map.put("digitCount", digitCount);
		map.put("letterCount", letterCount);
		return map;
	}

}
