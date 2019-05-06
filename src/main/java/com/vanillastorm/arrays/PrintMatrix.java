package com.vanillastorm.arrays;

/**
 *
 * Prints matrix.
 *
 */
public class PrintMatrix {
    public static void printMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int counter = 0;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
