package com.core.assertions;

import java.util.regex.Pattern;

public class Asset {
	public static void main(String[] args) {
		String name = null;
		assert name==null:"should not be null";
		Pattern.quote(name).length();
	}

}
