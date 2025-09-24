package com.banusha.Multithreading.assignment;

class WaitNotify {
    private boolean ready = false;

    public void produce() {
        System.out.println("Producer's Task begins.....");
        ready = true;
        notify(); 
        System.out.println("Producer notified Others consumers...");
    }

    public void consume() {
        System.out.println("Consumer waiting for producer...");
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed after notify!");
    }
}