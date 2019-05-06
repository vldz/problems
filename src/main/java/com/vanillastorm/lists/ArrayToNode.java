package com.vanillastorm.lists;

/**
 *
 * Converts an array to list.
 *
 */

public class ArrayToNode {
    public static ListNode arrayToNode (int[] array) {
        ListNode result = new ListNode(array[0]);
        ListNode marker = result;

        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            marker.next = newNode;
            marker = marker.next;
        }

        return result;
    }
}
