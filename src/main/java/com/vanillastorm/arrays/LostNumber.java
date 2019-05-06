package com.vanillastorm.arrays;

/**
 *
 * Find the missing number.
 *
 * Given an array of n - 1 integers and these integers are in the range of 1 to n.
 * One of the integers is missing in the list.
 * Finds the missing integer.
 *
 */

public class LostNumber {
    public static void absentNumberBidloCode(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[0] == 1) {
                System.out.println("absent number is 0");
                break;
            }

            if ((array[i] + array[i + 1]) % 2 == 0) {
                System.out.println("absent number is " + (array[i] + array[i + 1]) / 2);
                break;
            }
            if (array[i + 1] == array.length - 1) {
                System.out.println("absent number is " + array.length);
                break;
            }
        }
    }

    public static String lostNumber(int[] array) {
        int lower = 0;
        int higher = array.length;
        int mid;

        if (array[0] != 0) {
            return "lost number is 0";
        }

        if (array[array.length - 1] != array.length) {
            return "lost number is " + array.length;
        }

        while (lower != higher - 1) {
            mid = (lower + higher) / 2;

            if (array[mid] > mid) {
                higher = mid;
            } else {
                lower = mid;
            }
        }
        return "lost number is " + (array[lower] + array[higher]) / 2;
    }
}
