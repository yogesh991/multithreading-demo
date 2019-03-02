package com.vzt.bss.problem;

import java.util.LinkedList;

public interface ProducerConsumerProblem {

	int capacity =5;
	LinkedList<Integer> list = new LinkedList<Integer>();
	void produce() throws InterruptedException;
	void consume() throws InterruptedException;
}
