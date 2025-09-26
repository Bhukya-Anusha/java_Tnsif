package com.banusha.collections.lists;
import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
        Set<String> l = new HashSet<>();
        l.add("rahul");
        l.add("priya");
        l.add("sumit");
        System.out.println("Original Set: " + l);
        l.remove("priya");
        System.out.println("After removing priya: " + l);
    }
}
