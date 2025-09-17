package com.banusha.fmethod.assignment;

class Vehicle {
 final int wheels = 4;

 final void displayWheels() {
     System.out.println("Every vehicle has " + wheels + " wheels.");
 }
}
final class Bike extends Vehicle {  
 String name;

 Bike(String name) {
     this.name = name;
 }

 void display() {
     System.out.println("Bike name: " + name);
 }
}

public class FinalDemo {
 public static void main(String[] args) {
     Bike b1 = new Bike("Royal Enfield");

     b1.displayWheels();
     b1.display();

     
 }
}

