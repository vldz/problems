package com.vanillastorm.arrays.sorts;

/**
 *
 * Sorting algorithm.
 * Specifically an in-place comparison sort.
 *
 */

public class Selection {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
