package com.vanillastorm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int squares(int A, int B) {
        int currentMax = 0;
        if (A >= 2 && B <= 10000) {
            for (int i = A; i <= B; i++) {
                int temp = i;
                int current = 0;

                while (temp % Math.sqrt(temp) == 0) {
                    current++;
                    temp /= Math.sqrt(temp);
                }

                if (current > currentMax) {
                    currentMax = current;
                }
            }
        }
        return currentMax;
    }

    public static int[] uniqueNumbersArrayWithZeroSum(int N) {
        int size = N;
        int[] uniqueNums = new int[size];
//
//        int low = -N + 1;
//        int high = N;
//
//        int numbsize = (N * 2) - 1;
//        int[] numb = new int[numbsize];
//        int ind = 0;
//        while (low < high) {
//            numb[ind] = low;
//
//            ind++;
//            low++;
//        }
//
//        for (int i = 0; i < size; i++) {
//            if (i == size - 1 && size % 2 == 1) {
//                uniqueNums[size - 1] = 0;
//            } else {
//                if (i % 2 == 0) {
//                    uniqueNums[i] = numb[i];
//                } else {
//                    uniqueNums[i] = numb[numbsize - i];
//                }
//            }
//        }
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i == size - 1 && size % 2 == 1) {
                uniqueNums[size - 1] = 0;
            } else {
                if (i % 2 == 0) {
                    uniqueNums[i] = size - j;
                } else {
                    uniqueNums[i] = -size + j;
                    j++;
                }
            }
        }

        return uniqueNums;
    }

    public static int castles(int[] land) {
        if (land.length == 0) {
            return 0;
        } else if (land.length == 1) {
            return 1;
        } else {

            int firstcastle = 0;

            while (land[firstcastle] == land[firstcastle + 1]) {
                firstcastle++;
            }

            int castles = 1;

            for (int i = (firstcastle != 0) ? firstcastle : 1; i < land.length - 1; i++) {
                for (int j = i + 1; j != j + 1 && j < land.length - 1; j++) {
                    if (land[i - 1] == land[j + 1]) {
                        castles++;
                        i = j;
                        break;
                    } else if (land[j - 1] == land[j + 1] && land[j - 1] != land[j] && land[j + 1] != land[j]) {
                        castles++;
                        i = j;
                        break;
                    }
                }
            }
            return castles + 1;
        }

    }

    public static int addFiveToNumberToMakeItMax(int N) {
        List numberAsList = splitnum(N);
        int sign = 1;
        if ((int) numberAsList.get(0) < 0) {
            sign = -1;
        }
        int i = 0;
        while (i < numberAsList.size()) {
            if ((int) numberAsList.get(i) == 0 && numberAsList.size() == 1) {
                numberAsList.add(0, 5);
                break;
            } else if (5 >= (int) numberAsList.get(i)) {
                numberAsList.add(i, sign * 5);
                break;
            } else {
                i++;
            }
        }
        return collectNumber(numberAsList);
    }

    public static List splitnum(int N) {
        List result = new ArrayList();
        if (N == 0) {
            result.add(0);
        }

        while (N != 0) {
            result.add(0, N % 10);
            N = N / 10;
        }
        return result;
    }

    public static int collectNumber(List list) {
        int mult = 1;
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += (int) list.get(i) * mult;
            mult *= 10;
        }
        return result;
    }

    public static int minDistanceBetweenIndecesOfArrayWithAdjacentValues(int[] array) {
        if (array.length < 2) return -1;

        int min = array[0];
        int minIndex = 0;

        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        boolean found = false;
        int minDistance = Math.abs(maxIndex - minIndex);

        while (min < max) {
            max -= 1;
            int currentMaxIndex = maxIndex;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == max) {
                    found = true;
                    currentMaxIndex = j;
                }
            }

            if (found) {
                int currentDistance = Math.abs(maxIndex - currentMaxIndex);
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                }
                maxIndex = currentMaxIndex;
            }
            found = false;
        }

        return (minDistance != 0) ? minDistance : -1;
    }


    public static void main(String[] args) {
        int[] castleTest1 = {1, 2, 3, 2}; // 3
        int[] castleTest2 = {1, 2, 2, 2}; // 2
        int[] castleTest3 = {1, 2, 2, 1}; // 3
        int[] castleTest4 = {1, 2, 2, 1, 3, 3, -4, -4, -4, 3, 5}; // 4
        int[] castleTest5 = {1, 2};       // 2
        int[] castleTest6 = {1};          // 1
        int[] castleTest7 = {};           // 0
        int[] castleTest8 = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}; // 4

        System.out.println(castles(castleTest3));

        System.out.println(Arrays.toString(uniqueNumbersArrayWithZeroSum(3)));

        int[] adjacentValues = {0, 3, 3, 7, 5, 3, 11, 1};
        int[] adjacentValues2 = {1, 4, 7, 3, 3, 5};
        int[] adjacentValues3 = {};
        int[] adjacentValues4 = {1};
        int[] adjacentValues5 = {1, 1, 1, 1};

        System.out.println(minDistanceBetweenIndecesOfArrayWithAdjacentValues(adjacentValues5));
    }
}
