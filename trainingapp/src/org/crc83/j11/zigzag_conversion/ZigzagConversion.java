package org.crc83.j11.zigzag_conversion;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int length = s.length();
        List<List<Character>> result = new ArrayList<>();
        for (int row=0; row<numRows; row++) {
            result.add(new ArrayList<>());
        }

        int row=0;
        int direction = 1;
        for (int i=0; i<length;i++) {
            if ((row + direction)<0) {
                direction = 1;
            } else if ((row + direction)>= numRows) {
                direction =-1;
            }
            result.get(row).add(s.charAt(i));
            row = row + direction;
        }

        StringBuilder sb =  new StringBuilder();
        for (int r=0; r<numRows; r++) {
            result.get(r).forEach( ch ->
                    sb.append(ch));
        }

        return sb.toString();
    }
}
