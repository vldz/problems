package com.vanillastorm.arrays;

/**
 *
 * Given an array, rotates the array to the right by k steps, where k is non-negative.
 *
 */

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = nums[nums.length - k + i];
        }
        for (int j = k; j < rotatedArray.length; j++) {
            rotatedArray[j] = nums[j - k];
        }

        return rotatedArray;
    }
}
