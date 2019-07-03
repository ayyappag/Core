package com.core.concurrent.Executor;

import java.util.concurrent.TimeUnit;

public class TaskA implements Runnable {

	private static int count = 0;
	private int id;

	public TaskA() {
		this.id = ++count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("##### <TASK-" + id + "> STARTING #####");

		for (int i = 10; i > 0; i--) {
			System.out.println("##### <TASK-" + id + "> tick ::" + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) Math.random() * 1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		System.out.println("***** <TASK-" + id + "> ENDING *****");
	}

}
