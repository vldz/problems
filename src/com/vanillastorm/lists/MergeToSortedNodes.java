package com.vanillastorm.lists;

/**
 *
 * Given 2 sorted lists. Returns union.
 *
 */

public class MergeToSortedNodes {
    public static ListNode mergeTwoSortedNodes(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;

        while (l2 != null) {
            l1 = InsertElementInList.insertElementInNode(l1, l2.val);
            l2 = l2.next;
        }

        return l1;
    }
}
