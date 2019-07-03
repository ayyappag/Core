package com.core.exception;

public class TestExcep {

	public static void main(String[] args) {

		String name = null;

		try {
			  testException(null);

		} catch (CustomException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	public static void testException(String string) throws CustomException

	{
		System.out.println("First");
		if (string == null)
			throw new CustomException("The String value is null");
	}

}
