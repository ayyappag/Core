package com.thread;

public class ThreadInter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		System.out.println("Run By -- " + Thread.currentThread().getName());
		System.out.println("Run By -- " + Thread.currentThread().getPriority());

	}

}
