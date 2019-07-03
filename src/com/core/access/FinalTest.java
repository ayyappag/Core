package com.core.access;

public class FinalTest {

	
	public static void main(String[] args) {
		System.out.println(" finally return:"+test());
	}
	
	public static boolean test(){
		try{
			System.out.println("Df");
			return true;
		}
		finally
		{
			return false;
		}
	}
}
