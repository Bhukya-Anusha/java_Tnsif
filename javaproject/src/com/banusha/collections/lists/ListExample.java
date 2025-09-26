package com.banusha.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple"); 

        System.out.println("Original List: " + list);
        list.add(2, "Grapes");
        System.out.println("After adding Grapes at index 2: " + list);
        System.out.println("Element at index 3: " + list.get(3));

        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        System.out.println("Iterating using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
