package com.core.concurrent.Executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunnableThread {

	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		exService.submit(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("Starting");
				System.out.println("Runnable DOES NOT RETURN ANY VALUE like Duration:>>"+duration);
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Finished**");

			}
		});
		exService.shutdown();
	}

}
