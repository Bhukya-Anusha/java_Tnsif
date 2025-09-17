package com.banusha.smembers.assignment;

class Student {
    String name;
    int age;
    static String college = "Teegala Krishna Reddy Engineering College";

    Student(String n, int a) {
        name = n;
        age = a;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}

public class StaticMember {
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student("Anusha", 22);
        Student s2 = new Student("Dileep", 23);
        s1.display();
        s2.display();
        Student.changeCollege("TKR College of Engineering");
        s1.display();
        s2.display();
    }
}

