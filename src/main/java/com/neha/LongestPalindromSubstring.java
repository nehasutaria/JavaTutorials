package com.neha;
//e.g Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.

import java.util.stream.IntStream;

public class LongestPalindromSubstring {
    private int resultStart;
    private int resultLength;

    public static void main(String args[]) {
        LongestPalindromSubstring ls = new LongestPalindromSubstring();
        System.out.println(ls.longestSubstring("Neha"));

    }

    public String longestSubstring(String s) {
        int length = s.length();
        if (length < 2)
            return s;
        IntStream.range(0, length - 1).forEach(i -> {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        });
        return s.substring(resultStart, resultStart + resultLength);
    }

    public void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

}
