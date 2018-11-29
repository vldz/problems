package com.vanillastorm.lists;

/**
 *
 * Sorts a linked list using insertion sort.
 *
 * Algorithm of Insertion Sort:
 *
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 *
 */

public class ListInsertSort {
    public static ListNode insertSort(ListNode list) {
        if (list == null) {
            return list;
        }

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = list;

        while (list != null && list.next != null) {
            if (list.val > list.next.val) {
                ListNode marker = list.next;
                ListNode markerPrev = fakeHead;

                while (markerPrev.next.val < marker.val) {
                    markerPrev = markerPrev.next;
                }

                list.next = marker.next;
                marker.next = markerPrev.next;
                markerPrev.next = marker;

            } else {
                list = list.next;
            }
        }
        return fakeHead.next;
    }

}
