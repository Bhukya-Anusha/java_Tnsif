package com.banusha.Multithreading.assignment;

public class JoinMainDemo {
    public static void main(String[] args) {
        JoinDemo j1 = new JoinDemo();
        JoinDemo j2 = new JoinDemo();
        JoinDemo j3 = new JoinDemo();

        j1.setName("Thread-1");
        j2.setName("Thread-2");
        j3.setName("Thread-3");

        j1.start();
        try {
            j1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        j2.start();
        try {
            j2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        j3.start();
        try {
            j3.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}