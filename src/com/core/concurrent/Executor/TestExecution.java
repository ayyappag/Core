package com.core.concurrent.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecution {
	public static void main(String[] args) {
		System.out.println("Main Thread Starts Here");
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(new TaskA());
		service.execute(new TaskA());
		service.execute(new TaskA());
		service.shutdown();
	}
}
