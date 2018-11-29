package com.vanillastorm.other;

/**
 *
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves,
 * judges if this robot ends up at (0, 0) after it completes its moves.
 *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down).
 * If the robot returns to the origin after it finishes all of its moves, returns true. Otherwise, returns false.
 *
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc.
 * Also, assume that the magnitude of the robot's movement is the same for each move.
 *
 */

public class JudgeCircle {
    public static boolean judgeCircle(String moves) {

        int verticalCounter = 0;
        int horizontalCounter = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'U') {
                verticalCounter++;
            }
            if (moves.charAt(i) == 'D') {
                verticalCounter--;
            }
            if (moves.charAt(i) == 'L') {
                horizontalCounter++;
            }
            if (moves.charAt(i) == 'R') {
                horizontalCounter--;
            }
        }

        if (verticalCounter == 0 && horizontalCounter == 0) {
            return true;
        } else return false;
    }
}
