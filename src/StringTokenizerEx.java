import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "This is String 23123 , split by StringTokenizer, created by mkyong";
		
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("---- Split by comma ',' ------");
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		//	if(st2.==StreamTokenizer.TT_WORD)
		}
		
		
	}

}
