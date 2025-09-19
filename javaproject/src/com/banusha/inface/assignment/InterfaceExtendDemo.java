package com.banusha.inface.assignment;


interface Animal {
 void eat();   
}


interface Dog extends Animal {
 void bark();  
}


class Puppy implements Dog {
 public void eat() {
     System.out.println("Puppy eats dog food.");
 }
 public void bark() {
     System.out.println("Puppy barks softly.");
 }
}
public class InterfaceExtendDemo {
	 public static void main(String[] args) {
	        Puppy p = new Puppy();
	        p.eat();
	        p.bark();
	        Animal a = p;
	        a.eat();

	        Dog d = p;
	        d.bark();
	        d.eat();
	    }
}

