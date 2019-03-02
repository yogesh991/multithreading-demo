package com.vzt.bss.problem;

public class ProducerConsumerProblemImpl implements ProducerConsumerProblem{

	int count=1;
	
	@Override
	public void produce() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(list.size()==capacity)
					wait();
				System.out.println(" Producer Thread Produced : "+count);
				list.add(count++);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	@Override
	public void consume() throws InterruptedException{
		while(true) {
			synchronized(this) {
				while(list.size()==0) {
					wait();
				}
				System.out.println("Consumer Consumed : "+list.removeFirst());
				notify();
				Thread.sleep(1000);		
			}
		}
	
	}
	
}
