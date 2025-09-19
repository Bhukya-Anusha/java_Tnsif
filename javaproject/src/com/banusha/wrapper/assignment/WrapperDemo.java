package com.banusha.wrapper.assignment;

public class WrapperDemo {
	    public static void main(String[] args) {
	        // Example 1: Integer
	        int num = 10;
	        Integer intObj = num;     
	        System.out.println("Autoboxing (int → Integer): " + intObj);

	        Integer intObj2 = new Integer(20);
	        int num2 = intObj2;       // Auto-unboxing
	        System.out.println("Auto-unboxing (Integer → int): " + num2);

	        System.out.println("--------------------");

	        // Example 2: Double
	        double d = 15.75;
	        Double doubleObj = d;     // Autoboxing
	        System.out.println("Autoboxing (double → Double): " + doubleObj);

	        Double doubleObj2 = new Double(99.99);
	        double d2 = doubleObj2;   // Auto-unboxing
	        System.out.println("Auto-unboxing (Double → double): " + d2);

	        System.out.println("--------------------");

	        // Example 3: Character
	        char c = 'A';
	        Character charObj = c;    // Autoboxing
	        System.out.println("Autoboxing (char → Character): " + charObj);

	        Character charObj2 = new Character('Z');
	        char c2 = charObj2;       // Auto-unboxing
	        System.out.println("Auto-unboxing (Character → char): " + c2);
	    }
	}


