package com.vanillastorm.lists;

/**
 *
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 */

public class PartionList {
    public static ListNode partition(ListNode head, int x) {

        if (head == null) return null;

        ListNode firs = new ListNode(0);
        ListNode smaller = firs;
        ListNode firstBig = null;
        ListNode bigger = null;

        while (head != null) {
            if (head.val >= x) {
                ListNode newNode = new ListNode(head.val);
                if (bigger == null) {
                    firstBig = newNode;
                    bigger = firstBig;
                    smaller.next = bigger;
                } else {
                    bigger.next = newNode;
                    bigger = newNode;
                }
                head = head.next;
            } else {
                ListNode newNode = new ListNode(head.val);

                if (smaller == firs) {
                    firs.next = newNode;
                } else {
                    smaller.next = newNode;
                }
                smaller = newNode;
                newNode.next = firstBig;
                head = head.next;
            }
        }

        return firs.next;
    }
}

//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
