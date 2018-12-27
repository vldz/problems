package com.vanillastorm.arrays;

/**
 *
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.
 *
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 *
 * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 * Otherwise, it becomes vacant.
 * (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
 *
 * We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.
 *
 * Given the initial state of the prison, returns the state of the prison after N days (and N such changes described above.)
 *
 */

public class PrisonCellsAfterNDays {
    public static int[] prisonAfterNDays(int[] cells, int N) {
        int[] newArray = new int[cells.length];
        newArray[0] = 0;
        newArray[cells.length - 1] = 0;

        for (int i = 0; i < N; i++) {

            int j = 1;
            while (j < cells.length - 1) {
                if (cells[j - 1] == cells[j + 1]) {
                    newArray[j] = 1;
                } else {
                    newArray[j] = 0;
                }
                j++;
            }
            copy(newArray, cells);
        }
        return newArray;
    }

    private static int[] copy(int[] arrayCopyFrom, int[] arrayCopyTo) {
        for (int i = 0; i < arrayCopyFrom.length; i++) {
            arrayCopyTo[i] = arrayCopyFrom[i];
        }
        return arrayCopyTo;
    }

}
