package com.vanillastorm.other;

public class ValleyCounter {
    public static int countingValleys(int n, String s) {
        int valleys = 0;
        int altitude = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                altitude++;
            }
            if (s.charAt(i) == 'D') {
                altitude--;
            }

            if (altitude == 0 && s.charAt(i) == 'U') valleys++;
        }
        return valleys;
    }

    public static void main(String[] args) {
        String s = "DUDU";
        System.out.println(countingValleys(4, s));
    }
}
