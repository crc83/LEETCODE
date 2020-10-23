package org.crc83.j11.palindrome_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({"121,true", "12321, true", "0, true", "3, true", "-121,false", "10,false", })
    void testLongestPalindromicNumber(int input, boolean expected) {
        Solution main =  new Solution();
        assertEquals(expected, main.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({"99,2", "10,2", "333,3"})
    void testNumberOfDigits(int number, int numberOfDigits) {
        Solution main =  new Solution();
        assertEquals(numberOfDigits, main.numberOfDigits(number));
    }


}