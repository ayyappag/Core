package com.core.thread;

import java.util.Queue;

public class Consumer1 extends Thread {
    private final Queue sharedQ1;

    public Consumer1(Queue sharedQ1) {
        super("Consumer1");
        this.sharedQ1 = sharedQ1;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (sharedQ1) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ1.size() == 0) {
                    try {
                    	System.out.println("Queue is empty consumer1, waiting");
                        sharedQ1.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number =Integer.parseInt(sharedQ1.poll().toString());
                System.out.println("consuming consumer1 : " + number );
                sharedQ1.notify();
              
                //termination condition
                if(number == 3){break; }
            }
        }
    }
}


