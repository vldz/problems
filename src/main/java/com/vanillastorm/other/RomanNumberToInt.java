package com.vanillastorm.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * Given a roman numeral, converts it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * */

public class RomanNumberToInt {

    public static int romeMap(String line) {
        Map<Character, Integer> romeInteger = new HashMap<Character, Integer>();
        romeInteger.put('M', 1000);
        romeInteger.put('D', 500);
        romeInteger.put('C', 100);
        romeInteger.put('L', 50);
        romeInteger.put('X', 10);
        romeInteger.put('V', 5);
        romeInteger.put('I', 1);
        romeInteger.put('O', 0);

        int resultNumber = 0;
        int i = 0;
        line += "O";

        while (i < line.length()) {
            if (line.charAt(i) == 'O') {
                return resultNumber;
            }

            if (line.charAt(i) == 'I' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 1;
                i++;
            }

            if (line.charAt(i) == 'X' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 10;
                i++;
            }

            if (line.charAt(i) == 'C' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 100;
                i++;
            }

            if (romeInteger.containsKey(line.charAt(i))) {
                resultNumber += romeInteger.get(line.charAt(i));
                i++;
            }
        }
        return resultNumber;
    }

    public static int romanToInt(String s) {
        int number = 0;
        s += 'O';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                number += 900;
                i += 2;
            }
            if (s.charAt(i) == 'M') {
                number += 1000;
            }
            if (s.charAt(i) == 'D') {
                number += 500;
            }

            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                number += 400;
                i += 2;
            }
            if (s.charAt(i) == 'C') {
                number += 100;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                number += 90;
                i += 2;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                number += 40;
                i += 2;
            }
            if (s.charAt(i) == 'L') {
                number += 50;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                number += 9;
                i += 2;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                number += 4;
                i += 2;
            }
            if (s.charAt(i) == 'X') {
                number += 10;
            }
            if (s.charAt(i) == 'V') {
                number += 5;
            }
            if (s.charAt(i) == 'I') {
                number += 1;
            }
            if (s.charAt(i) == 'O') {
                return number;
            }
        }
        return number;
    }

}
