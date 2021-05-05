package com.neha;

public class StringContainsOnlyDigit {
    public static void main(String[] args){

        if(checkDigit("1234"))
            System.out.println("String is digit");
        else
            System.out.println("Not digit");
    }
    public static boolean checkDigit(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                return true;
        }

        return false;
    }
}
