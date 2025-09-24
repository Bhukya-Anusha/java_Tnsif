package com.banusha.Multithreading.assignment;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();
        Thread consumer = new Thread(new Runnable() {
            public void run() {
                wn.consume();
            }
        });
        Thread producer = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                wn.produce();
            }
        });

        consumer.start();
        producer.start();
    }
}