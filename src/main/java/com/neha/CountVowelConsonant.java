package com.neha;
//import org.springframework.util.StringUtils;
//import org.apache.commons.lang.StringUtils;



public class CountVowelConsonant {
    public static void main(String[] args){
        String str = "How many vowels in this String";
        char[] charStr = str.toCharArray();
        int vowel=0; int consonant=0;
        for(Character c: charStr){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel ++;
                    break;
                default:
                    consonant++;
            }
        }
        System.out.println("Number of vowel: " + vowel);
        System.out.println("Number of consonant: " + consonant);
    }
    public static int countOccuranceOfChar(String s, char c){
        //int count = StringUtils.
        return 0;
    }

}
