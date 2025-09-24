package com.banusha.Multithreading.assignment;

public class PriorityMainDemo {

	public static void main(String[] args) {
		PriorityDemo p=new PriorityDemo();
		PriorityDemo p1=new PriorityDemo();
		p.setPriority(1);
		p1.setPriority(10);
		p.start();
		p1.start();
	}

}
