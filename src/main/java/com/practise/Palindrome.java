package com.practise;

public class Palindrome {
    public static void main(String[] args){
        /*if(checkPalindrome("abcabc"))
            System.out.println("Palindorme");
        else
            System.out.println("Not Palindorme");*/
        //System.out.println(reverseInt(931343999));
        System.out.println(revRecursion("Neha"));

    }
    public static boolean checkPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
            return true;
        else
            return false;
    }
    public static int reverseInt(int n){

        int rev =0;
        while (n > 0){
            rev = (rev *10) + (n %10);
            n = n/10;
            if(n > Integer.MAX_VALUE || n <Integer.MIN_VALUE)
                return 0;
        }
        return rev;
    }
    public static String revRecursion(String str){
        if(str.isEmpty() || str == null)
            return str;
        return str.charAt(str.length() -1) + revRecursion(str.substring(0, str.length() -1 )) ;
    }

}
