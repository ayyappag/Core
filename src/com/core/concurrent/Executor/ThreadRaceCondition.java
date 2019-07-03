package com.core.concurrent.Executor;

class Ticketbooking implements Runnable {

	int availableTickets = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Waiting to book ticket for :"
				+ Thread.currentThread().getName());

		synchronized (this) {
			if (availableTickets > 0) {
				System.out.println("Booking ticket for :"
						+ Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				availableTickets--;
				System.out.println("Ticket BOOKED for : "
						+ Thread.currentThread().getName());
				System.out.println("currently ticketsAvailable = "
						+ availableTickets);

			} else
				System.out.println("Ticket NOT BOOKED for : "
						+ Thread.currentThread().getName());
		}

	}
}

public class ThreadRaceCondition {

	public static void main(String[] args) {
		Ticketbooking obj = new Ticketbooking();

		Thread thread1 = new Thread(obj, "Passenger1");
		Thread thread2 = new Thread(obj, "Passenger2");

		thread1.start();
		thread2.start();
	}

}
