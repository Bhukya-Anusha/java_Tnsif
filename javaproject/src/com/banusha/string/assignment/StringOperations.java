package com.banusha.string.assignment;

public class StringOperations {
    public static void main(String[] args) {
        
        System.out.println("---- String Operations ----");
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenation: " + concatStr);
        
        // Length
        System.out.println("Length of str1: " + str1.length());
        
        // Substring
        System.out.println("Substring (0-3): " + str1.substring(0, 3));
        
        // Uppercase & Lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        
        // Character at index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        
        // ------------------ StringBuffer -------------------
        System.out.println("\n---- StringBuffer Operations ----");
        StringBuffer sbf = new StringBuffer("Hello");
        
        // Append
        sbf.append(" World");
        System.out.println("After Append: " + sbf);
        
        // Insert
        sbf.insert(5, " Java");
        System.out.println("After Insert: " + sbf);
        
        // Replace
        sbf.replace(6, 10, "C++");
        System.out.println("After Replace: " + sbf);
        
        // Delete
        sbf.delete(6, 10);
        System.out.println("After Delete: " + sbf);
        
        // Reverse
        sbf.reverse();
        System.out.println("After Reverse: " + sbf);
        
        // -------------------- StringBuilder -------------------
        System.out.println("\n---- StringBuilder Operations ----");
        StringBuilder sbd = new StringBuilder("Hello");
        
        // Append
        sbd.append(" World");
        System.out.println("After Append: " + sbd);
        
        // Insert
        sbd.insert(5, " Java");
        System.out.println("After Insert: " + sbd);
        
        // Replace
        sbd.replace(6, 10, "Python");
        System.out.println("After Replace: " + sbd);
        
        // Delete
        sbd.delete(6, 12);
        System.out.println("After Delete: " + sbd);
        
        // Reverse
        sbd.reverse();
        System.out.println("After Reverse: " + sbd);
    }
}
