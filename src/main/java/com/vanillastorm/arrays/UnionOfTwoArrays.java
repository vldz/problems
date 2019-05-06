package com.vanillastorm.arrays;

/**
 *
 * Returns Union of two arrays.
 *
 */

public class UnionOfTwoArrays {
    public static int[] unionOfTwoArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int resultIndex = 0;
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;

        while (resultIndex < result.length) {
            if (firstArrayIndex < array1.length && secondArrayIndex < array2.length) {
                if (array1[firstArrayIndex] < array2[secondArrayIndex]) {
                    result[resultIndex] = array1[firstArrayIndex];
                    firstArrayIndex++;
                    resultIndex++;
                } else {
                    result[resultIndex] = array2[secondArrayIndex];
                    secondArrayIndex++;
                    resultIndex++;
                }
            } else if (firstArrayIndex == array1.length && resultIndex < result.length) {
                result[resultIndex] = array2[secondArrayIndex];
                secondArrayIndex++;
                resultIndex++;
            } else {
                result[resultIndex] = array1[firstArrayIndex];
                firstArrayIndex++;
                resultIndex++;
            }

        }

        return result;
    }

}
