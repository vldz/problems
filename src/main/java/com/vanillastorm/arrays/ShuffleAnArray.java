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
        boolean[] usedIndexes = new boolean[size];

        for (int i = 0; i < size; i++) {

            boolean isInserted = false;
            while (!isInserted) {
                int randomNumberToInsert = random(size);

                if (!isInList(randomNumberToInsert, usedIndexes)) {
                    usedIndexes[randomNumberToInsert] = true;
                    newArray[i] = this.array[randomNumberToInsert];
                    isInserted = true;
                }
            }
        }

        return newArray;
    }

    public int[] shuffle2() {
        int size = this.array.length;
        int[] newArray = new int[size];

        fillArrayWithAnotherArray(this.array, newArray);

        for (int i = 0; i < size; i++) {
            int randomIndex = random(size);
            int temp = newArray[i];
            newArray[i] = newArray[randomIndex];
            newArray[randomIndex] = temp;
        }

        return newArray;
    }

    private void fillArrayWithAnotherArray(int[] array, int[] arrayToFill) {
        for (int i = 0; i < array.length; i++) {
            arrayToFill[i] = array[i];
        }
    }

    private boolean isInList(int temp, boolean[] array) {
        return array[temp];
    }

    private int random(int range) {
        return (int) (Math.random() * range);
    }

}
