package com.vanillastorm.arrays;

/**
 *
 * Given a matrix A, returns the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
 *
 */

public class TransposeMatrix {
    public static int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int row = 0; row < A[0].length; row++) {
            for (int column = 0; column < A.length; column++) {
                B[row][column] = A[column][row];
            }
        }
        return B;
    }
}
