package com.banusha.arrayexception;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Outer try block begins...");
            try {
                String str = "Hi";
                System.out.println("Accessing 5th character: " + str.charAt(5));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
