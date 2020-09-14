package org.crc83.j11.zigzag_conversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class ZigzagConversionTest {

    @ParameterizedTest
    @CsvSource({"PAYPALISHIRING,3,PAHNAPLSIIGYIR", "PAYPALISHIRING,4,PINALSIGYAHRPI","ABC,1,ABC","ABC,2,ACB"})
    void testConvert(String input, int rows, String expected) {
        ZigzagConversion main = new ZigzagConversion();
        assertEquals(expected, main.convert(input,rows));
    }
}