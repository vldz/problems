package com.vanillastorm.arrays;

/**
 *
 * Fibonacci numbers are the numbers in the following integer sequence,
 * characterized by the fact that every number after the first two is the sum of the two preceding ones:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 *
 */

public class Fibonacci {

    public static int[] fibonacci(int amount) {
        int[] fibonacci = new int[amount];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < amount; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    // 0 1 1 2 3 5 (8) n = 6
    public static int recursiveFindElementInFibonacciSequence(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFindElementInFibonacciSequence(n - 1) + recursiveFindElementInFibonacciSequence(n - 2);
        }
    }
}
