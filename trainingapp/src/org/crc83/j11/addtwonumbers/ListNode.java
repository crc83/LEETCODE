package org.crc83.j11.addtwonumbers;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode l(int val) {
        return new ListNode(val);
    }

    public static ListNode l(int val, ListNode next) {
        return new ListNode(val, next);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode node = (ListNode) o;
        return val == node.val &&
                Objects.equals(next, node.next);
    }

    @Override
    public String toString() {
        return "->" + val  + (next!=null ? next.toString() : "*");
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
