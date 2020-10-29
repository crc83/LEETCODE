package org.crc83.j11streams;

import java.util.Arrays;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode wrap(int i) {
        return new ListNode(i);
    }

    public ListNode join(ListNode head, ListNode tail) {
        head.next = tail;
        return head;
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
