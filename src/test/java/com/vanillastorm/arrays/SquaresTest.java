package com.vanillastorm.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SquaresTest {
    @Test
    void shouldReturnAmountOfSquares() {
        int expected = 2;
        int actual = Solution.squares(2,81);

        assertEquals(expected, actual);
    }
}
