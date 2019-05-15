package com.vanillastorm.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints += 1;
            } else if (a.get(i) < b.get(i)) {
                bobPoints += 1;
            }
        }

        return new ArrayList<>(Arrays.asList(alicePoints, bobPoints));
    }
}
