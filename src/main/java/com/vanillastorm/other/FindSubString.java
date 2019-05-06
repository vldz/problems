package com.vanillastorm.other;

public class FindSubString {
    public static String findSubString(String line) {

        int i = 0;
        int currentMax = 0;
        int max = 0;
        String subLine = "";
        int[] counters = new int[26];

        while (i < line.length()) {
            if (currentMax > max) {
                max = currentMax;
            }

            if (counters[line.charAt(i) - 'a'] == 0) {
                currentMax++;
                subLine += line.charAt(i);
                counters[line.charAt(i) - 'a']++;
                i++;
            } else {
                counters = new int[26];
                subLine = "";
                currentMax = 0;
                counters[line.charAt(i) - 'a'] = 0;
                subLine += line.charAt(i);
                i++;
            }
        }
        return subLine;
    }

}
