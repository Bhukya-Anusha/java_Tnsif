package com.banusha.Multithreading.assignment;

public class MainThreadDemo {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.setPriority(1);
		td.start();
		
		ThreadDemo td1=new ThreadDemo();
		td1.setPriority(10);
		td1.start();
	}

}
