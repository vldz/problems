package com.vanillastorm.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Returns the element repeated N times.
 *
 * Example 1:
 * Input: [1,2,3,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,1,2,5,3,2]
 * Output: 2
 *
 */

public class NRepeatedElementInSize2NArray {
    public static int repeatedNTimes(int[] A) {
        Map<Integer, Integer> valuesAndRepeatAmount = new HashMap<>();
        int neededAmountOfRepeat = A.length / 2;

        for (int i = 0; i < A.length; i++) {
            if (valuesAndRepeatAmount.containsKey(A[i])) {
                int newValue = valuesAndRepeatAmount.get(A[i]) + 1;
                valuesAndRepeatAmount.put(A[i], newValue);
            } else {
                valuesAndRepeatAmount.put(A[i], 1);
            }
        }

        int max = 1;
        int valueInMax = 0;

        for (int key : valuesAndRepeatAmount.keySet()) {
            if (valuesAndRepeatAmount.get(key) > max) {
                max = valuesAndRepeatAmount.get(key);
                valueInMax = key;
            }
        }

        return (neededAmountOfRepeat == max) ? valueInMax : 0;
    }

    public static int repeatedNTimesOneUniqueElement(int[] array) {
        int counter = 1;
        int rememberedNumber = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            while (counter < 2 && j < array.length) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter == 2) {
                    rememberedNumber = array[i];
                    break;
                }
                j++;
            }
        }
        return rememberedNumber;
    }
}
