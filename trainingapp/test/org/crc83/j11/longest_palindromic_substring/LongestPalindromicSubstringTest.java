package org.crc83.j11.longest_palindromic_substring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @ParameterizedTest
    @CsvSource({"babcd,bab","cbbd,bb","cabbac,cabbac","123aaddaa123aabb,aaddaa","lrewekr,ewe", "a,a", "ac,a"})
    void testLongestPalindrome(String input, String result) {
        LongestPalindromicSubstring main = new LongestPalindromicSubstring();
        assertEquals(result, main.longestPalindrome(input));
    }
}