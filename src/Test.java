import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] argv) {
		Map map = new HashMap();

		map.put("Adobe", "Mountain View, CA");
		map.put("IBM", "White Plains, NY");
		map.put("Learning Tree", "Los Angeles, CA");

		Iterator k = map.keySet().iterator();
		Set Set = map.keySet();

		while (k.hasNext()) {
			String key = (String) k.next();
			System.out.println("Key " + key + "; Value "
					+ (String) map.get(key));
		}

		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("A", new Double(3434.34));
		hm.put("B", new Double(123.22));
		hm.put("C", new Double(1378.00));
		hm.put("D", new Double(99.22));
		hm.put("E", new Double(-19.08));

		Set<Map.Entry<String, Double>> set = hm.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		int i =0;
		int j =0;
		System.out.println("i++ -- " + i++);
		System.out.println("++j -- "+ ++j);
		String a = "test";
		if(a instanceof String){
			System.out.println(" instanceOf True");
		}
		else
			System.out.println("else block");

	}
}