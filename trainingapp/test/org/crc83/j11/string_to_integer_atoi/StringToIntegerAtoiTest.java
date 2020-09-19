package org.crc83.j11.string_to_integer_atoi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {

    @ParameterizedTest
    @CsvSource({"`42`,42", "`        -42`,42", "`4193 with words`,4193", "`words and 987`,0", "`-91283472332`,-2147483648"})
    void testStringToIntegerAtoi(@ConvertWith(StrWithWhitespaceConverter.class) String input, int expected) {
        StringToIntegerAtoi main =  new StringToIntegerAtoi();
        assertEquals(expected, main.myAtoi(input));
    }

}