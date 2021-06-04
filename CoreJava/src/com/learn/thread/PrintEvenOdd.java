package com.learn.thread;

public class PrintEvenOdd {
	int counter = 1;
	static int number = 0;

	public void printEven() throws InterruptedException
	{
		synchronized (this)
		{
		while (counter < number) {
			System.out.println(" " + counter);
			while (counter / 2 == 0) {
				wait();
			}

			Thread.sleep(1000);

			counter++;
			notify();
		}

	}
}

	public void printOdd() throws InterruptedException
	{
		synchronized (this)
		{
		while (counter < number) {
			System.out.println(" " + counter);
			while (counter / 2 == 1) {
				wait();
			}

			Thread.sleep(1000);

			counter++;
			notify();
		}

	}
	}

	public static void main(String[] args) {
		number = 10;

		PrintEvenOdd printEvenOdd = new PrintEvenOdd();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					printEvenOdd.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					printEvenOdd.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
	}

}
