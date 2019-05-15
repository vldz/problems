package com.vanillastorm.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {
    @Test
    void castlesTest1() {
        int[] land = {1, 2, 3, 2}; // 3

        int expectedAmountOfCastles = 3;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest2() {
        int[] land = {1, 2, 2, 2}; // 2

        int expectedAmountOfCastles = 2;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest3() {
        int[] land = {1, 2, 2, 1}; // 3

        int expectedAmountOfCastles = 3;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest4() {
        int[] land = {1, 2, 2, 1, 3, 3, -4, -4, -4, 3, 5}; // 4

        int expectedAmountOfCastles = 4;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest5() {
        int[] land = {1, 2};       // 2

        int expectedAmountOfCastles = 2;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest6() {
        int[] land = {1};          // 1

        int expectedAmountOfCastles = 1;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest7() {
        int[] land = {};           // 0

        int expectedAmountOfCastles = 0;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }

    @Test
    void castlesTest8() {
        int[] land = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}; // 4

        int expectedAmountOfCastles = 4;
        int actualAmmountOfCastles = Solution.castles(land);

        assertEquals(expectedAmountOfCastles, actualAmmountOfCastles);
    }
}
