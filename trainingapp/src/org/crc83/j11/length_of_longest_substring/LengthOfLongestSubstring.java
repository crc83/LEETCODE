package org.crc83.j11.length_of_longest_substring;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstringStr(s).length();
    }


    public String lengthOfLongestSubstringStr(String s) {
        for (int length = s.length(); length>=0; length--) {
            for (int ofs = 0; ofs <= s.length()-length; ofs++) {
                String subst = s.substring(ofs, ofs+length);
                String restOfIt = noRepeatsInRestOfString(subst);
                if (restOfIt != null) return subst;
            }
        }
        return "";
    }

    public String noRepeatsInRestOfString(String s) {
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i< s.length(); i++) {
            CharSequence ch = s.substring(i,i+1);
            String restOfIt = s.substring(i+1);
            if (restOfIt.contains(ch)) {
                break;
            }
            return noRepeatsInRestOfString(restOfIt);
        }
        return null;
    }
}
