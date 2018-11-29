package com.vanillastorm.lists;

/**
 *
 * Inserts new Node by value in right position.
 *
 */

public class InsertElementInList {
    public static ListNode insertElementInNode(ListNode l, int val) {
        if (l == null) {
            return new ListNode(val);
        }

        if (l.val > val) {
            ListNode newNode = new ListNode(val);
            newNode.next = l;
            return newNode;
        }

        ListNode mark = l;
        if (mark.val < val) {
            while (mark != null) {
                if (mark.val <= val && mark.next == null || mark.val <= val && mark.next.val > val) {
                    ListNode nextMark = mark.next;
                    ListNode newNode = new ListNode(val);
                    mark.next = newNode;
                    newNode.next = nextMark;
                    return l;
                } else {
                    mark = mark.next;
                }
            }
        }

        return l;
    }

}
