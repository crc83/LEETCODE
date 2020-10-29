package org.crc83.j11streams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {


    @ParameterizedTest
    @CsvSource({
            "8, [4;1;8;4;5], [5;6;1;8;4;5], 2, 3",
            "2, [1;9;1;2;4], [3;2;4],       3, 1",
            "0, [2;6;4],     [1;5],         3, 2"
    })
    public void testGetIntersectionNode(int intersectVal ,
                                        @ConvertWith(IntArrayConverter.class) int[] listA,
                                        @ConvertWith(IntArrayConverter.class) int[] listB,
                                        int skipA, int skipB) {
        IntersectionOfTwoLinkedLists main = new IntersectionOfTwoLinkedLists();
        ListNode listNodeA = newInstance(listA);
        ListNode listNodeB = newInstance(listB);

        IntStream.of(listA).peek(System.out::println).count();
        IntStream.of(listB).peek(System.out::println).count();
    }

    public ListNode newInstance(int[] listA) {
        return Arrays.stream(listA)
                .sequential()
                .mapToObj(ListNode::new)
                .peek(System.out::println)
                .findFirst().get();

    }

}