package org.crc83.j11.length_of_longest_substring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLongestSubstringTest {

    @ParameterizedTest
    @CsvSource({"abcabcbb,abc", "bbbbb,b", "pwwkew,wke", "'',''"})
    void lengthOfLongestSubstring(String input, String expected) {
        LengthOfLongestSubstring main = new LengthOfLongestSubstring();
        assertEquals(expected, main.lengthOfLongestSubstring(input));
    }
}