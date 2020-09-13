package org.crc83.j11.longest_palindromic_substring;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String palindromeMax = "";
        int palindromeMaxLength = 0;
        int inputLength = s.length();
        if (inputLength==1) return s;
        for (int i = 0; i<  inputLength - 1; i++) {
            String palindromeOdd = panindromeOdd(s,i);
            String palindromeEven = palindromeEven(s,i);
            if (null != palindromeOdd) {
                int length = palindromeOdd.length();
                if (length > palindromeMaxLength) {
                    palindromeMaxLength = length;
                    palindromeMax = palindromeOdd;
                }
            }
            if (null != palindromeEven) {
                int length = palindromeEven.length();
                if (length > palindromeMaxLength) {
                    palindromeMaxLength =length;
                    palindromeMax = palindromeEven;
                }
            }
        }
        return palindromeMax;
    }

    public String panindromeOdd(String s, int middle) {
        String result = String.valueOf(s.charAt(middle));
        //start numbering from 0
        int possibleMaxLength = Math.min(middle, s.length() - middle -1);
        for (int i = 0; i<= possibleMaxLength; i++) {
            if (s.charAt(middle-i) == s.charAt(middle+i)) {
                result = s.substring(middle - i, middle + i + 1);
                continue;
            }
            return result;
        }
        return result;
    }

    public String palindromeEven(String s, int middle) {
        String result = null;
        //start numbeing from 0
        // * * 2 * * *
        int possibleMaxLength = Math.min(middle, s.length() - middle - 2);
        for (int i = 0; i<= possibleMaxLength; i++) {
            if (s.charAt(middle - i) == s.charAt(middle + i +1)) {
                result = s.substring(middle - i, middle + i + 2);
                continue;
            }
            return result;
        }
        return result;
    }
}
