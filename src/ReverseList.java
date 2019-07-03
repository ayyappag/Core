import java.util.Arrays;
import java.util.List;

public class ReverseList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list;
		// list = new int[5];
		list = new int[] { 3, 1, 2, 6, 4, 2 };
		// System.out.println("first::"+list);
		reverse(list);
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
		List<String> lst = Arrays.asList(str);
		System.out.println("lst size::" + lst.size());
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		System.out.println();
		System.out
				.println("Array reverse : with out creating new array object");
		for (int i = 0; i < result.length / 2; i++) {
			int temp = result[i];
			result[i] = result[result.length - i - 1];
			result[result.length - i - 1] = temp;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

		System.out.println("For String array also");

		for (int i = 0; i < str.length / 2; i++) {
			String temp = str[i];
			str[i] = str[str.length - i - 1];
			str[str.length - i - 1] = temp;
		}
		for (String s : str)
			System.out.print(s);

		return result;
	}
}
