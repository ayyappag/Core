package com.core.concurrent.Executor;

import java.util.Random;

public class ThreadInterruppted {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting *** ");
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				Random random = new Random();
				for (int i = 0; i < 1E8; i++) {
					Math.sin(random.nextDouble());
				}

			}
		});

		t.start();

		t.interrupt();

		t.join();
		System.out.println(" Finished **");
	}

}
