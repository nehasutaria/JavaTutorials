package com.recursion;

public class Palindrome {
    public static void main(String[] args){
        String str = "madam";
        if(checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindorme");
    }
    public static boolean checkPalindrome(String str){

        if(str.equals(rev(str)))
            return true;
        else
            return false;
    }
    public static String rev(String str){
        if(str.isEmpty() || str == null)
            return str;
        return str.charAt(str.length() -1) + rev(str.substring(0, str.length()-1));
    }
}
