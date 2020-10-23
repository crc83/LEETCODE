package org.crc83.j11.palindrome_number;


//Not solved.
public class Solution {

    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x<10) return true;
        int numberOfDifits = numberOfDigits(x);
        int number = x;
        int[] digits = new int[numberOfDifits];
        for (int i = numberOfDifits; i >0; i--) {
//            digits[i] = x - Math.floor()
        }
        //odd amount of digits
        //even amount of digits
        return false;
    }

    public int numberOfDigits(int x) {
        return (int) Math.round(Math.floor(Math.log10(x)))+1;
    }
}