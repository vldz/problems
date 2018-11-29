package com.vanillastorm.arrays.sorts;

/**
 *
 * A simple sorting algorithm.
 * Repeatedly steps through the list, compares adjacent pairs and swaps them if they are in the wrong order.
 *
 */

public class Bubble {
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
