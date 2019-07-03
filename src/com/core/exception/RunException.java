package com.core.exception;

public class RunException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1261754322116541965L;

	public RunException() {
		// TODO Auto-generated constructor stub
		System.out.println("Default RunException ");
	}

	public RunException(String message) {
		// TODO Auto-generated constructor stub
		super(message); // it should be first line in constructor
		System.out.println("Overridden RunException ");
		
	}
}
