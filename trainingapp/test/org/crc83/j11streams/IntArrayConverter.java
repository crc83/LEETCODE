package org.crc83.j11streams;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;
import java.util.function.Predicate;

public class IntArrayConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && int[].class.isAssignableFrom(targetType)) {
            return Arrays.stream(((String) source).split("\\s*;\\s*"))
                    .map(s -> s.replace("[", "").replace("]",""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } else {
            throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                    + targetType + " not supported.");
        }
    }
}
