package com.vzt.bss.problem;

public class ProducerConsumerThreads {

	
	public static void main(String args[]) throws InterruptedException {
		
		final ProducerConsumerProblemImpl pcProblem = new ProducerConsumerProblemImpl();

		Thread producerThread = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					pcProblem.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		Thread consumerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pcProblem.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
	}
	
}
