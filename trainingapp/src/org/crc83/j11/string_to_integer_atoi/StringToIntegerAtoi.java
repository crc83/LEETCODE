package org.crc83.j11.string_to_integer_atoi;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class StringToIntegerAtoi {

    public int myAtoi(String str) {
        Set<Character> sign = Set.of('-','+');
        Set<Character> signOrDigit = Set.of('-','+','0','1','2','3','4','5','6','7','8','9');
        Set<Character> digit =  Set.of('0','1','2','3','4','5','6','7','8','9');
        int numberStart = -1;
        char[] input = str.toCharArray();
        for (int i = 0; i< input.length; i++) {
            //find first sign or digit
            //check if there is only whitespaces on the way
            if (input[i] != ' ') {
                if (signOrDigit.contains(input[i])) {
                    //start of number
                    numberStart = i;
                    break;
                } else {
                    break;
                }
            }
        }
        if (numberStart<0) return 0;
        int numberEnd = -1;
        int startFrom = numberStart;
        if (sign.contains(input[numberStart])) {
            if ((input.length<=(numberStart +1)) || !digit.contains(input[numberStart+1])) {
                return 0;
            }
            startFrom = numberStart+1;
        }
        for (int i=startFrom; i< input.length;i++) {
            if (digit.contains(input[i])) {
                numberEnd=i+1;
            } else {
                break;
            }
        }
        if (numberEnd<0) {
            numberEnd = input.length;
        }
        String number = str.substring(numberStart, numberEnd);
        if ("+".equals(number) || "-".equals(number)) {
            return 0;
        }
        try {
             return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            if (input[numberStart] == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
