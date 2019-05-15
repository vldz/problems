package com.vanillastorm.arrays;

import java.util.ArrayList;
import java.util.List;

public class VeryBigSum {
    public static long veryBigSum(long[] ar) {
        List sumList = numberToList(ar[0]);
        for (int i = 1; i < ar.length; i++) {
            sumTwoLists(sumList, numberToList(ar[i]));
        }
        return listToNumber(sumList);
    }

    public static List numberToList(long number) {
        List<Long> numberAsList = new ArrayList();
        while (number != 0) {
            numberAsList.add(number % 10);
            number /= 10;
        }

        return numberAsList;
    }

    public static List sumTwoLists(List l1, List l2) {
        long reminder = 0;
        for (int i = 0; i < l1.size(); i++) {
            long tempElementSum = (long) l1.get(i) + (long) l2.get(i) + reminder;
            if (tempElementSum > 9) {
                l1.set(i, tempElementSum % 10);
                reminder = tempElementSum / 10;
            } else {
                l1.set(i, tempElementSum);
                reminder = 0;
            }
        }
        if (reminder != 0){
            l1.add(reminder);
        }
//        System.out.println(listToNumber(l1));
        return l1;
    }

    public static long listToNumber(List list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (long) list.get(i) * (long) Math.pow(10, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] ar = {1001458909, 1004570889, 1007019111, 1003302837, 1002514638, 1006431461, 1002575010, 1007514041, 1007548981, 1004402249};
        veryBigSum(ar);
    }

}
//          1 1   1   1
//    1 0 0 1 4 5 8 9 0 9
//    1 0 0 4 5 7 0 8 8 9
//   --------------------
//    2 0 0 6 0 2 9 7 9 8