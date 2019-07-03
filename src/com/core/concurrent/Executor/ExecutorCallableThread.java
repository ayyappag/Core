package com.core.concurrent.Executor;

import java.io.IOError;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableThread {

	public static void main(String[] args) {
		ExecutorService exService = Executors.newCachedThreadPool();
		Future<Integer> future = exService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub

				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("Starting");
				System.out
						.println(" Callable RETURN ANY VALUE like Duration:>>"
								+ duration);
				try {
					if (duration>1000) {
						throw new IOException("Sleeping for too long"); // try this also
					}
					
					Thread.sleep(duration);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Finished**");
				return duration;
			}
		});

		exService.shutdown();

		try {
			System.out.println(" Duration Value " + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace(); // try with out comment
			IOException ex = (IOException)e.getCause();
			System.out.println(ex.getMessage());
		}
	}

}
