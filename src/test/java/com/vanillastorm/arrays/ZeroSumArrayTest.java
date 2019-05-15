package com.vanillastorm.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroSumArrayTest {
    @Test
    void shouldReturnZeroSumArrayWithOddSize() {
        int expectedSum = 0;
        int [] actualArray = Solution.uniqueNumbersArrayWithZeroSum(3);
        int actualSum = sumOfElementsInArray(actualArray);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturnZeroSumArrayWitEvenSize() {
        int expectedSum = 0;
        int [] actualArray = Solution.uniqueNumbersArrayWithZeroSum(6);
        int actualSum = sumOfElementsInArray(actualArray);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturnZeroWIthArraySize1() {
        int expectedSum = 0;
        int [] actualArray = Solution.uniqueNumbersArrayWithZeroSum(1);
        int actualSum = sumOfElementsInArray(actualArray);

        assertEquals(expectedSum, actualSum);
    }

    private int sumOfElementsInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}