package com.learn.thread;

class MyThreadPool implements java.util.concurrent.Executor 
{
    private final java.util.concurrent.BlockingQueue<Runnable> queue;

    public MyThreadPool(int numThreads) {
        queue = new java.util.concurrent.LinkedBlockingQueue<>();
        for (int i=0 ; i<numThreads ; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    while(true) {
                        try {
							queue.take().run();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    }
                }
            }).start();
        }
    }

    @Override
    public void execute(Runnable command) {
        try {
			queue.put(command);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}