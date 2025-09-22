package com.banusha.arrayexception;

public class StringBound {
	 public static void main(String[] args) {
	        String str = "Hello";
	        try {
	            char ch = str.charAt(10);
	            System.out.println("Character at index 10: " + ch);
	        } catch (Exception e) {
	            System.out.println("Exception: " + e);
	            System.out.println("String length is " + str.length() + ", but need to access invalid index");
	        }

	        System.out.println("Program continues after exception handling");
	    }
}
