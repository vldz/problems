package com.vanillastorm.lists;

/**
 *
 * Prints list.
 *
 */

public class PrintList {
    public static void printList(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " -> ");
            l = l.next;
        }
        System.out.println("null");
    }

    public static void recurPrintList(ListNode l) {
        if (l == null) {
            return;
        }
        System.out.println(l.val);
        recurPrintList(l.next);
    }
}
