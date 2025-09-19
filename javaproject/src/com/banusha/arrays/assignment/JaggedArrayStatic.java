package com.banusha.arrays.assignment;

public class JaggedArrayStatic {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[3];  
        jagged[1] = new int[2]; 
        jagged[2] = new int[4];  
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int index = 0; 
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = values[index++];
            }
        }
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
