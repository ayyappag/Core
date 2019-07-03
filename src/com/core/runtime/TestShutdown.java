package com.core.runtime;

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("shutdown hook task completed");
		Runtime.getRuntime().gc();
	}

}

public class TestShutdown {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new MyThread());

		/**
		 * addShutdownHook : This method is called by the system to give a
		 * Thread a chance to clean up before it actually exits.
		 *
		 *
		 * private void exit() {
        if (group != null) {
            group.threadTerminated(this);
            group = null;
        }
        Aggressively null out all reference fields: see bug 4006245
		target = null;
        /* Speed the release of some of these resources 
         threadLocals = null;
        inheritableThreadLocals = null;
        inheritedAccessControlContext = null;
        blocker = null;
        uncaughtExceptionHandler = null;
    } */
		System.out.println("Now main sleeping :: exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}

}
