package com.vanillastorm.arrays.sorts;

/**
 *
 * A simple sorting algorithm.
 * Builds the final sorted array (or list) one item at a time.
 *
 */

public class Insertion {
    public static int[] insertionSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i--;
                }
            }
        }
        return array;
    }
}
