package com.banusha.collections.lists;

import java.util.*;

public class ComparableMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(101, "Anusha", 85));
        students.add(new Student(102, "Priya", 92));
        students.add(new Student(103, "Dileep", 78));
        students.add(new Student(104, "Lokesh", 92));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Collections.sort()
        Collections.sort(students);

        System.out.println("\nAfter Sorting (by marks, then by name):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
