package com.neha;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args){

        /*Boolean f = anagramCheck("listen", "silent");
        if(f)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");*/
        System.out.println(countNumberOfOccuranceInString("hello hello helloe", 'e'));

    }
    public static boolean anagramCheck(String s1, String s2){
        char[] charStr1 = s1.toCharArray();
        char[] charStr2 = s2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        System.out.println(charStr1);
        System.out.println(charStr2);
        return Arrays.equals(charStr1, charStr2);
    }
    public static long countNumberOfOccuranceInString(String str, char c){
        long count;
        count = str.chars().filter(ch -> ch == c).count();
        return count;
    }
}
