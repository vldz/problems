package com.vanillastorm.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a matrix of m x n elements (m rows, n columns).
 * Returns all elements of the matrix in spiral order.
 *
 */

public class SpiralOrderMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int rowLenght = matrix.length;
        int columnLength = matrix[0].length;

        int amountOfElements = rowLenght * columnLength;

        int stepCounter = 1;
        int rowIndex = 0;
        int columnIndex = 0;
        int leftmostIndexInColumns = 0;
        int upmostIndexInRows = 0;
        int directionMarker = 0;

        result.add(matrix[0][0]);

        while (stepCounter < amountOfElements) {
            switch (directionMarker) {
                case 0:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    columnIndex++;
                    while (columnIndex < columnLength) {
                        result.add(matrix[rowIndex][columnIndex]);
                        columnIndex++;
                        stepCounter++;
                    }
                    columnIndex--;
                    upmostIndexInRows++;
                    directionMarker = 1;

                case 1:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    rowIndex++;
                    while (rowIndex < rowLenght) {
                        result.add(matrix[rowIndex][columnIndex]);
                        rowIndex++;
                        stepCounter++;
                    }
                    rowIndex--;
                    columnLength--;
                    directionMarker = 2;

                case 2:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    columnIndex--;
                    while (columnIndex >= leftmostIndexInColumns) {
                        result.add(matrix[rowIndex][columnIndex]);
                        columnIndex--;
                        stepCounter++;
                    }
                    columnIndex++;
                    //leftmostIndexInColumns++;
                    rowLenght--;
                    directionMarker = 3;

                case 3:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    rowIndex--;
                    while (rowIndex >= upmostIndexInRows) {
                        result.add(matrix[rowIndex][columnIndex]);
                        rowIndex--;
                        stepCounter++;
                    }
                    rowIndex++;
                    leftmostIndexInColumns++;
                    directionMarker = 0;
            }
        }
        return result;
    }
}
