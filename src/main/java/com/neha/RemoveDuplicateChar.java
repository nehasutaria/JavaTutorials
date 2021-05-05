package com.neha;

import javax.xml.transform.sax.SAXResult;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args){
        String str = "bananas";
        //System.out.println("Original String " + str);
      //  System.out.println("Removed Duplicate Char " + removeDup(str));
        System.out.println("Removed Duplicate Char " + removeDup2(str));
        //removeDup1(str);
    }
    public static String removeDup(String str){
        Set<Character> charSet = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            charSet.add(str.charAt(i));
        }
        return charSet.toString();
    }
    public static void removeDup1(String str){
        Set<Character> charSet = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            charSet.add(str.charAt(i));
        }
        for(Character c : charSet)
            System.out.print(c);
    }
    public static String removeDup2(String str) {
        //StringBuilder sb = new StringBuilder();
        String s = new String();
        for(int i=0; i<str.length();i++){
            char c =str.charAt(i);
            if(str.indexOf(c) < 0) {
                s += c; //sb.append(str.charAt(i));
            }
        }
        System.out.println(s);
        return s;
    }
}
