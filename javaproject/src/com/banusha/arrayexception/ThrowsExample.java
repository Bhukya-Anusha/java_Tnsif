package com.banusha.arrayexception;

public class ThrowsExample {
    static void ExceptionOperation() throws ArithmeticException {
        int a = 10, b = 0;
        int result = a / b; 
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            ExceptionOperation();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
