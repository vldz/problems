package com.vanillastorm.arrays;

/**
 *
 * Shuffles a set of numbers without duplicates.
 *
 * Example:
 *
 * Inits an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * Shuffles the array [1,2,3] and returns its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 *
 * Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 *
 */

public class ShuffleAnArray {
    private final int[] array;

    public ShuffleAnArray(int[] nums) {
        this.array = nums;
    }

    public int[] reset() {
        return this.array;
    }

    public int[] shuffle() {
        int size = this.array.length;

        int[] newArray = new int[size];
        boolean[] arrayOfUsedIndexes = new boolean[size];

        for (int i = 0; i < size; i++) {

            boolean isInserted = false;
            while (!isInserted) {
                int randomNumberToInsert = random(size);

                if (!isInList(randomNumberToInsert, arrayOfUsedIndexes)) {
                    arrayOfUsedIndexes[randomNumberToInsert] = true;
                    newArray[i] = this.array[randomNumberToInsert];
                    isInserted = true;
                }
            }
        }

        return newArray;
    }

    private boolean isInList(int temp, boolean[] array) {
        return array[temp];
    }

    private int random(int range) {
        return (int) (Math.random() * range);
    }

}
