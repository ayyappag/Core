import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BubbleSort2 {
	/** The method for sorting the numbers */
	public static void bubbleSort(int[] list) {
		boolean needNextPass = true;

		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
	
	
	public static void bubbleSort2(int[] list) {
		boolean needNextPass = true;

		for (int k = 1; k < list.length ; k++) {
			// Array may be sorted and next pass not needed
			//needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					// Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					//needNextPass = true; // Next pass still needed
				}
			}
		}
	}

	public static void main(String[] args) {
		//int[] list = { 75, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		int[] list = { 7,5,3,1,9};
		bubbleSort2(list);
		// same in Java 5
		// Arrays.sort(list);

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
