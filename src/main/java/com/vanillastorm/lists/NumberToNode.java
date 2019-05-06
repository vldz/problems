package com.vanillastorm.lists;

import java.util.LinkedList;

/**
 *
 * Converts given integer to List, where each digit is a separate Node.
 *
 */

public class NumberToNode {
    public static LinkedList numberToNode(ListNode x) {
        LinkedList<Integer> linkedListNumber = new LinkedList<>();
        while (x.val != 0) {
            linkedListNumber.add(x.val % 10);
            x.val /= 10;
        }
        return linkedListNumber;
    }
}
