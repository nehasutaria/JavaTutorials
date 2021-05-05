//"AAAAA", "aaaa","Aaaaa" - valid otherwise invalid word

package com.neha;

import java.util.function.Predicate;

public class DetectUpperCase {
    public static void main(String args[]) {
        String word = "USA";
        String word1 = "India";
        String word2 ="neha";
        String word3 = "AnMoL";
        if(detectCapitalUsage(word2))
            System.out.println("Valid capital usage");
        else
            System.out.println("Not Valid Capital usage");
    }
    public static boolean detectCapitalUsage(String s){
        int len = s.length();
        if(len<2)
            return true;
        Predicate<Character> correctCase =  Character :: isLowerCase;
        if(Character.isUpperCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1))) {
            correctCase = Character::isUpperCase;
        }
        for(int i=1; i<len; i++)
            if (!correctCase.test(s.charAt(i))) return false;
        return  true;
    }

    public static boolean detecCapital(String s) {
        int len = s.length();
        if (Character.isUpperCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1))) {
            for (int i = 2; i < len; i++) {
                if (Character.isLowerCase(s.charAt(i)))
                    return false;
            }
        } else {
            for (int i = 1; i < len; i++) {
                if (Character.isUpperCase(s.charAt(i)))
                    return false;
            }
        }
        return true;
    }
}