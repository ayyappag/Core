package com.core.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();
		/* Array Declaration and initialization */
		String citynames[] = new String[] { "Agra", "Mysore", "Chandigarh",
				"Bhopal" };

		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(
				Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New City2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist) {
			System.out.println(str);
		}

	}

}
