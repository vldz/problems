package com.vanillastorm.lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example 1:
 *
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 */

public class SelfDevidingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List result = new ArrayList();

        boolean flag = false;
        int devidor = 0;

        for (int i = left; i <= right; i++) {
            int temp = i;

            while (temp != 0) {
                devidor = temp % 10;
                if (devidor != 0 && i % devidor == 0) {
                    flag = true;
                    temp /= 10;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                result.add(i);
            }
        }
        return result;
    }
}
