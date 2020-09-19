package org.crc83.j11.string_to_integer_atoi;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class StrWithWhitespaceConverter implements ArgumentConverter {


    @Override
    public Object convert(Object input, ParameterContext context) throws ArgumentConversionException {
        String inputSting = (String) input;
        return inputSting.substring(1,inputSting.lastIndexOf("`"));
    }

}
