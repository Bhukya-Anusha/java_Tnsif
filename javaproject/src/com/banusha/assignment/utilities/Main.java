package com.banusha.assignment.utilities;

import com.banusha.assignment.employees.*;

public class Main {
    public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager("Alice", 101, 85000, 10);
        mgr.displayDetails();
        System.out.println("------------------");

        // Create Developer object
        Developer dev = new Developer("Bob", 102, 60000, "Java");
        dev.displayDetails();
    }
}