package com.javaEight;

import java.util.stream.Stream;

public class CheckStringForAllLetter {
    public static void main(String[] args){
        String str = "Farmer jack realized that big yellow quilts were expensive" ;
        String str2 = "Farmer arme realized that big yellow quilts were expensive" ;
        String str1 = "Neha S";
        if(checkString(str2))
            System.out.println("Yes, String has all alphabet");
        else
            System.out.println("No, String has not all alphabet");

    }
    public static boolean checkString(String str){
        long cnt = str.toLowerCase().chars().filter(ch -> ch>='a' && ch <='z').distinct().count();
        if(cnt == 26)
            return true;
        else
            return false;
    }
}
