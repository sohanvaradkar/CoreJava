package com.learn.thread;

public class ThreadEvenOdd 
{
//Java program for the above approach



	// Starting counter
	int counter = 1;

	static int N;

	// Function to print odd numbers
	public void printOddNumber() throws InterruptedException
	{
		synchronized (this)
		{
			// Print number till the N
			while (counter < N) {
				System.out.print(
						counter + " ");
				// If count is even then print
				while (counter % 2 == 0) {
					//System.out.print(counter + " ");
					// Exception handle
					try {
						wait();
					}
					catch (
						InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Print the number
				
				
				Thread.sleep(1000);
				// Increment counter
				counter++;

				// Notify to second thread
				notify();
			}
		}
	}

	// Function to print even numbers
	public void printEvenNumber() throws InterruptedException
	{
		synchronized (this)
		{
			// Print number till the N
			while (counter < N) {
				System.out.print(
						counter + " ");
				// If count is odd then print
				while (counter % 2 == 1) {
					
					// Exception handle
					try {
						wait();
					}
					catch (
						InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Print the number
				
Thread.sleep(1000);
				// Increment counter
				counter++;

				// Notify to 2nd thread
				notify();
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given Number N
		N = 10;

		// Create an object of class
		ThreadEvenOdd mt = new ThreadEvenOdd();

		// Create thread t1
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				try {
					mt.printEvenNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// Create thread t2
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					mt.printOddNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();
	}
}
