package com.core.exception;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("Default Exception ");
	}

	public CustomException(String message) {
		super(message);
		System.out.println("Overridden Exception ");
	}

}
