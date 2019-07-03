package com.core.thread;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();
        
        //final Queue sharedQ1 = new LinkedList();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);
        //Thread consumer1 = new Consumer1(sharedQ);

        producer.start();
        consumer.start();
        //consumer1.start();

    }
}


