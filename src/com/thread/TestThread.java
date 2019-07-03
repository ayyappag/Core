package com.thread;

public class TestThread // extends Thread
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadInter run = new ThreadInter();
		Thread test = new Thread(run,"TETS");
		test.setName("threadName");
		test.setPriority(7);
		
		System.out.println("::: ==" +test.getName());
		test.run();
		
	}

}
