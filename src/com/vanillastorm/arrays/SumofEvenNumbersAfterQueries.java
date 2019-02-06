package com.vanillastorm.arrays;

/**
 * We have an array A of integers, and an array queries of queries.
 *
 * For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the i-th query is the sum of the even values of A.
 *
 * (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)
 *
 * Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 */

public class SumofEvenNumbersAfterQueries {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int size = queries.length;
        int[] resultArray = new int[size];

        int sumOfEvenNumbers = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sumOfEvenNumbers += A[i];
            }
        }

        for (int i = 0; i < size; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            if (A[index] % 2 == 0) {
                sumOfEvenNumbers -= A[index];
            }
            A[index] += val;
            if (A[index] % 2 == 0) {
                sumOfEvenNumbers += A[index];
            }
            resultArray[i] = sumOfEvenNumbers;

        }

        return resultArray;
    }
}
