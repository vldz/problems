package com.vanillastorm.other;

/**
 *
 * Takes an Integer as input and returns the integer reversed.
 *
 */

public class ReverceInt {
    public static int reverse(int x) {
        int resultNumber = 0;
        int size = 0;
        int cur = x;

        while (cur != 0) {
            cur = cur / 10;
            size++;
        }

        int[] numbers = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            numbers[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i < size; i++) {
            resultNumber += numbers[i] * Math.pow(10, i);
        }

        return resultNumber;
    }
}
