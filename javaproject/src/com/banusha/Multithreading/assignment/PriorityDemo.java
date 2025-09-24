package com.banusha.Multithreading.assignment;

public class PriorityDemo extends Thread{
	public void run() {
	System.out.println("The running Thread is :" +Thread.currentThread().getName());
	System.out.println("The running Thread Priority is :" +Thread.currentThread().getPriority());
	}
}
