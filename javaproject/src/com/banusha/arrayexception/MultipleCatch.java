package com.banusha.arrayexception;

public class MultipleCatch{
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            String str = "Hello";
            int result = numbers[1] / 0;
            System.out.println(numbers[5]);
            System.out.println(str.charAt(10));

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
