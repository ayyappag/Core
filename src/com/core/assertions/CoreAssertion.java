package com.core.assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.util.Assert;

public class CoreAssertion {

	public static void main(String[] args) {
		System.out.println("main 1");
		test("f");
		System.out.println("main 2");
	}

	public static void test(String name) {
		System.out.println("test method");
		if(name == null){
			System.out.println("dfsdf");
		}
		 Assert.notNull(name, " Name's must not be null");

		List<String> al = null ; // new ArrayList<>();
	//	al.add("d");
	//	al.add("d");
	//	 al.add(null);
		Assert.hasText(name);

		System.out.println("tested");
		Assert.hasLength(name); // its checks for the input argument has the
								// value or not
		//Objects.requireNonNull(name);
		Objects.requireNonNull(name, "name should not be null");
		 Assert.hasText(name, "name must have text");
		
		
		System.out.println("df");
		Objects.requireNonNull(al);
	//	Assert.noNullElements(al.toArray()); // validation check for the NULL 		// elements in the Array Object.
												// It will not allow the NULL 		// values
	}
}
