package com.banusha.constructor.assignment;

class Std {
	    String name;
	    int age;
	    String course;

        //Constructor 1:
	    Std() {
	        name = "Unknown";
	        age = 0;
	        course = "Not Assigned";
	    }

	    // Constructor 2:
	    Std(String n) {
	        name = n;
	        age = 0;
	        course = "Not Assigned";
	    }

	    // Constructor 3: 
	    Std(String n, int a) {
	        name = n;
	        age = a;
	        course = "Not Assigned";
	    }

	    // Constructor 4: 
	    Std(String n, int a, String c) {
	        name = n;
	        age = a;
	        course = c;
	    }

	    // Method to display student details
	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	    }
	}

	public class Student {
	    public static void main(String[] args) {
	        // Calling different constructors
	        Std s1 = new Std();
	        Std s2 = new Std("Anusha");
	        Std s3 = new Std("Priya", 22);
	        Std s4 = new Std("Tarun", 25, "Computer Science");

	        // Displaying details
	        s1.display();
	        s2.display();
	        s3.display();
	        s4.display();
	    }
	}

