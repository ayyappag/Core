package com.core.concurrent.Executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerThreadCallable implements Callable<Long> {

	long sleeptime;

	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" : WorkerThreadCallable : ");
		return sleeptime * 1000;
	}

	public WorkerThreadCallable(long sleeptime) {
		this.sleeptime = sleeptime;
	}

}

public class CallableThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Long> workerThread = new WorkerThreadCallable(1000);
		ExecutorService exService = Executors.newSingleThreadExecutor();

		Future<Long> future = exService.submit(workerThread);
		System.out.println("Returned Value :=>"+future.get());
		exService.shutdown();
		
		System.out.println("DONE");
		
		
		
	}

}
