package com.vanillastorm.other;

/**
 *
 *  Takes a string as input and returns the string reversed.
 *
 */

public class ReverceString {

    // hello --> olleh
    public static String reverseString(String s) {
        char[] result = new char[s.length()];
        result = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            char left = result[i];
            char right = result[j];

            result[j] = left;
            result[i] = right;

        }
        return new String(result);
    }

}
