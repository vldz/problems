package com.vanillastorm.lists;

public class FindHead {
    public static ListNode findHead(ListNode list) {
        ListNode head = list;

        ListNode newHead = new ListNode(5);
        newHead.next = head;

        list = newHead;

        while (list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");

        return newHead;
    }
}
