package com.vanillastorm.lists;

/**
 *
 * Reverses a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 */

public class ReverseList {
    public static ListNode reverseList(ListNode myList) {
        if (myList == null) {
            return myList;
        }

        ListNode head = myList;
        ListNode prev = null;
        ListNode next = head.next;

        while (head != null) {
            head.next = prev;
            prev = head;
            head = next;
            if (head != null) {
                next = head.next;
            }
        }
        return prev;
    }
}
