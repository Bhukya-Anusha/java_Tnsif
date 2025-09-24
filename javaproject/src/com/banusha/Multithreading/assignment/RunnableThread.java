package com.banusha.Multithreading.assignment;

public class RunnableThread {

	public static void main(String[] args) {
		RunnableInf ri=new RunnableInf();
		Thread t1=new Thread(ri);
		t1.start();

	}

}
