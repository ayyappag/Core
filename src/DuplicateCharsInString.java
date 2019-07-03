

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	public void findDuplicateChars(String str) {

		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for (Character ch : chrs) {
			if (dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch) + 1);
			} else {
				dupMap.put(ch, 1);
			}
		}
		Set<Character> keys = dupMap.keySet();
		for (Character ch : keys) {
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
			System.out.println(ch+":"+dupMap.get(ch));
		}
		
		Set<Character> s = new HashSet<Character>();
		dupMap = new HashMap<Character, Integer>();
		for (Character ch : chrs) {
			if(!s.add(ch)) {
				if (dupMap.containsKey(ch)) {
					dupMap.put(ch, dupMap.get(ch) + 1);
				} else {
					dupMap.put(ch, 2);
				}
			}
		}
		System.out.println(dupMap);
		
	}

	public static void main(String a[]) {
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars("ayyappabcdef");
	}
}
