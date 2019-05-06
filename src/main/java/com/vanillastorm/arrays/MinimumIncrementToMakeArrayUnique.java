package com.vanillastorm.arrays;

import java.util.Arrays;

/**
 *
 * Given an array of integers A, a move consists of choosing any A[i], and incrementing it by 1.
 *
 * Returns the least number of moves to make every value in A unique.
 *
 * Input: [3,2,1,2,1,7]
 * Output: 6
 * Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
 * It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
 *
 */

public class MinimumIncrementToMakeArrayUnique {

    public static int minIncrementForUnique(int[] array) {

        Arrays.sort(array);

        int move = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                array[i]++;
                move++;
            }
            if (array[i - 1] >= array[i]) {
                int j = 0;
                while (j < i) {
                    if (array[j] != array[i]) {
                        j++;
                    } else {
                        int old = array[i];
                        array[i] = array[i - 1] + 1;
                        move += array[i] - old;
                        break;
                    }
                }
            }
        }
        return move;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 6, 8, 9};
        System.out.println(minIncrementForUnique(array));
    }
}











