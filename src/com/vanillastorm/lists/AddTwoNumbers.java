package com.vanillastorm.lists;

/**
 *
 * Given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Adds the two numbers and return it as a linked list.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode oldNode = result;

        int reminder = 0;
        int sum = 0;

        while (l1 != null || l2 != null) {
            ListNode newNode = new ListNode(0);

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            sum = val1 + val2 + reminder;
            reminder = sum / 10;
            sum %= 10;

            newNode.val = sum;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

            oldNode.next = newNode;
            oldNode = newNode;
        }

        if (reminder > 0) {
            ListNode reminderNode = new ListNode(reminder);
            oldNode.next = reminderNode;
        }

        return result.next;
    }
}
