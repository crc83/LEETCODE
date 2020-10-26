package org.crc83.j11streams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {


    @ParameterizedTest
    @CsvSource({
            "8, [4,1,8,4,5], [5,6,1,8,4,5], 2, 3",
            "2, [1,9,1,2,4], [3,2,4], 3, 1",
            "0, [2,6,4], [1,5], 3, 2"
    })
    public void testGetIntersectionNode(int intersectVal , int[] listA, int[] listB, int skipA, int skipB) {
        IntStream.of(listA).peek(System.out::println).count();
        IntStream.of(listB).peek(System.out::println).count();
    }

}