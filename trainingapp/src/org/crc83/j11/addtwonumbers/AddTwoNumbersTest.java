package org.crc83.j11.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.crc83.j11.addtwonumbers.ListNode.l;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void testListToInt() {
        AddTwoNumbers main = new AddTwoNumbers();
        assertEquals(42, main.listToInt(l(2,l(4))));
        assertEquals(421, main.listToInt(l(1,l(2,l(4)))));
    }

    @Test
    void testAddShortInt() {
        AddTwoNumbers main = new AddTwoNumbers();
        assertEquals(l(3), main.addTwoNumbers(l(1),l(2)));
        assertEquals(l(2,l(1)), main.addTwoNumbers(l(10),l(2)));
        assertEquals(l(2,l(9)), main.addTwoNumbers(l(9,l(8)),l(3)));
    }
}