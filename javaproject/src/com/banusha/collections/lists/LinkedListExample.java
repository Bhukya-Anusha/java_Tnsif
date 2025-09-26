package com.banusha.collections.lists;

import java.util.LinkedList;

public class LinkedListExample {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");

	        System.out.println("Original LinkedList: " + list);
	        list.addFirst("Grapes");
	        list.addLast("Orange");
	        System.out.println("After addFirst and addLast: " + list);
	        System.out.println("First element: " + list.getFirst());
	        System.out.println("Last element: " + list.getLast());
	        list.removeFirst();
	        list.removeLast();
	        System.out.println("After removeFirst and removeLast: " + list);
	        System.out.println("Iterating using for-each loop:");
	        for (String fruit : list) {
	            System.out.println(fruit);
	        }
	    }
	}
