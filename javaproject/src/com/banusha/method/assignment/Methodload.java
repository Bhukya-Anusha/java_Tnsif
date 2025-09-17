package com.banusha.method.assignment;

public class Methodload{

    // Overloaded method 1: 
    void display(int a, double b) {
        System.out.println("Method with (int, double) called: a = " + a + ", b = " + b);
    }

    // Overloaded method 2: 
    void display(double a, int b) {
        System.out.println("Method with (double, int) called: a = " + a + ", b = " + b);
    }

    // Overloaded method 3: 	
    void display(String name, int age) {
        System.out.println("Method with (String, int) called: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        Methodload obj = new Methodload();

        obj.display(10, 20.5);        
        obj.display(15.5, 5);         
        obj.display("Anusha", 22);    
    }
}
