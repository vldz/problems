package com.vanillastorm.arrays;

/**
 * Checks if an array is a mountain array.
 *
 * A is a mountain array if and only if:
 *         A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 *         A[0] < A[1] < ... A[i-1] < A[i]
 *         A[i] > A[i+1] > ... > A[B.length - 1]
 *
 */

public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }

        int topOfMountain = 0;
        int indexOnTop = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > topOfMountain) {
                topOfMountain = A[i];
                indexOnTop = i;
            }
        }

        if (indexOnTop == 0 || indexOnTop == A.length) {
            return false;
        }

        for (int i = 0; i < indexOnTop; i++) {
            if (A[i] >= A[i + 1]) {
                return false;
            }
        }

        for (int i = indexOnTop + 1; i < A.length; i++) {

            if (A[i] == topOfMountain || A[i-1] <= A[i] ) {
                return false;
            }
        }

        return true;
    }
}
