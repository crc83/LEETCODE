package org.crc83.j11streams;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode wrap(int i) {
        return new ListNode(i);
    }

    public static ListNode join(ListNode head, ListNode tail) {
        ListNode item = head;
        while (item.next != null) {
            item =  item.next;
        }
        item.next = tail;
        System.out.println(">>"+head);
        return head;
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return " " + val + ", " + next;
    }
}
