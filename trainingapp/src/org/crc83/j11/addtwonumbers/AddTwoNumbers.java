package org.crc83.j11.addtwonumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode resultDigit = null;
        ListNode nextDigit = null;
        int transfer = 0;

        ListNode l1int = l1;
        ListNode l2int = l2;
        do {
            int digit = l1int.val + l2int.val + transfer;
            transfer = 0;
            if (digit > 10) {
                nextDigit = new ListNode(digit - 10);
                transfer = 1;
            } else {
                nextDigit = new ListNode(digit);
            }
            if (resultDigit == null) {
                resultDigit = nextDigit;
            } else {
                resultDigit.next = nextDigit;
                resultDigit = nextDigit;
            }
            l1int = l1int != null ? l1int.next : null;
            l2int = l2int != null ? l2int.next : null;

            l1int = l1int != null ? l1int : new ListNode(0);
            l2int = l2int != null ? l2int : new ListNode(0);
            if (result == null) {
                result = resultDigit;
            }
        } while (l1int.next != null || l2int.next != null);

        return result;
    }

    int listToInt(ListNode listNode) {
        if (listNode == null) {
            return 0;
        }
        int result = 0;
        ListNode node = listNode;
        int ten = 1;
        do {
            result = result + node.val * ten;
            node = node.next;
            ten *= 10;
        } while (node != null);
        return result;
    }
}
