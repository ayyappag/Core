import java.util.*;

public class ListConverter {
	public static void main(String[] args) {

		List<String> t = new ArrayList<String>();
		t.add("ayyappa(POWER)");
		t.add("NAIDU(WORLD)");
		System.out.println("" + t);

		List<String> newlist = new ArrayList<String>();

		for (Iterator iterator = t.iterator(); iterator.hasNext();) {

			String istring = (String) iterator.next();
			System.out.println(" for loop == " + istring);

			int startIndex = istring.indexOf("(");
			int endIndex = istring.indexOf(")");
			System.out.println("startIndex= " + startIndex + "=end == "
					+ endIndex);

			String pre = istring.substring(0, startIndex);
			System.out.println("ore == " + pre);

			String test = istring.substring(startIndex + 1, endIndex);
			StringBuffer name = new StringBuffer();
			name.append(pre).append("(").append("").append(test.toLowerCase())
					.append(")");

			System.out.println("== name ==  " + name);
			newlist.add(name.toString());
		}

		for (int i = 0, l = t.size(); i < l; ++i) {
			t.add(t.remove(0));
		}
		System.out.println(":t:" + t);
		System.out.println(" new list == " + newlist);
	}

}