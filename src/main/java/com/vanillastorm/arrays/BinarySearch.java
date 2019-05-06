package com.vanillastorm.arrays;

/**
 *
 * A search algorithm.
 * Finds the position of a target value within a sorted array.
 *
 */

public class BinarySearch {
    public static void binarySearch(int numberToFind, int[] array) {
        int lower = 0, higher = array.length, mid;
        while (lower < higher) {
            mid = (lower + higher) / 2;
            System.out.println(mid);
            if (numberToFind == array[mid]) {
                System.out.println("your number " + numberToFind + " is in array[" + array[mid] + "]");
                break;
            } else {
                if (numberToFind <= array[mid]) {
                    higher = mid;
                } else {
                    lower = mid;
                }
            }
        }
    }
}
